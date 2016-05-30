package webcert.ch06.ex0604;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by AmauryEsparza on 5/28/16.
 */
public class Reflector {

    String className;
    List<Class> interfaces;
    List<String> methods;

    public Reflector(Object obj){
        System.out.println("Object class " + obj.getClass());
        interfaces = new ArrayList<>();
        methods = new ArrayList<>();
        Class<?> currentClass = obj.getClass();
        className = currentClass.getName();

        //Adding interfaces classes to a set
        for(Class<?> mInterface : currentClass.getInterfaces()){
            interfaces.add(mInterface);
        }

        for(Method mMethod : currentClass.getMethods()){
            methods.add(mMethod.getName());
        }
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List interfaces) {
        this.interfaces = interfaces;
    }

    public List getMethods() {
        return methods;
    }

    public void setMethods(List methods) {
        this.methods = methods;
    }
}

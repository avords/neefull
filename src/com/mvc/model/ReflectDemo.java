package com.mvc.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {

    public static void main(String[] args) throws Exception{
        Tea t = new Tea();
        t.setNameZh("闫仕达");
        Field f1 = t.getClass().getDeclaredField("name");
        String filedName = f1.getName()+"Zh";
        Object o = invokeGet(filedName,t);
        invokeSet(f1.getName(), t, o);
        System.out.println(t.getName());
    }
    public static Object invokeGet(String fieldName,Object t) throws Exception{
        Class cl = t.getClass();
        String methodName = "get"+captureName(fieldName);
        Method method = cl.getDeclaredMethod(methodName, null);
        return method.invoke(t, null);
    }
    public static void invokeSet(String fieldName,Object t,Object value) throws Exception{
        Class cl = t.getClass();
        String methodName = "set"+captureName(fieldName);
        Method method = cl.getDeclaredMethod(methodName, value.getClass());
        method.invoke(t, value);
    }
    public static String captureName(String name) {
             char[] cs=name.toCharArray();
             cs[0]-=32;
             return String.valueOf(cs);
         }
}

class Tea{
    private String nameZh;
    private String name;
    private String age;
    private int number;

    public String getNameZh() {
        return nameZh;
    }
    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
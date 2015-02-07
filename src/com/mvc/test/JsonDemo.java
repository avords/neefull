package com.mvc.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.mvc.model.Student;

public class JsonDemo {

    public static void main(String[] args) throws Exception {
//        BufferedReader in = new BufferedReader(
//                new FileReader("D:/abc.json"));
//        StringBuilder b = new StringBuilder();
//        String s;
//        while((s = in.readLine())!=null){
//            b.append(s);
//        }
//        String json = b.toString();
//        Gson gson = new Gson();
//        Object obj = gson.fromJson(json, Object.class);
//        System.out.println(obj);

        Gson gson = new Gson();
        List list = new ArrayList();
        Student xsf = new Student();
        xsf.setName("薛少飞");
        xsf.setAge(27);
        xsf.setGender("男");
        xsf.setIdentityNumber("18295178873");
        xsf.setNumber(20100499);

        Student lt = new Student();
        lt.setName("雷涛");
        lt.setAge(28);
        lt.setGender("男");
        lt.setIdentityNumber("18295178873");
        lt.setNumber(20100438);

        list.add(xsf);
        list.add(lt);
        list.add("中华人民共和国");
        list.add(21);
        list.add(21.55);

        String str = gson.toJson(list);
        System.out.println(str);

        Map map = new HashMap();
        map.put("薛少飞", xsf);
        map.put("雷涛", lt);
        map.put("CH", "中华人民共和国");

        String str1 = gson.toJson(map);
        System.out.println(str1);
    }
}

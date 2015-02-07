package com.mvc.test;

import java.util.ArrayList;
import java.util.List;


public class Demo {

    public static void main(String[] args){
        List<String> page = new ArrayList();
        transList(page);
        System.out.println(page);
   }

    public static void transList(List<String> page){
        List<String> list = new ArrayList();
        list.add("薛少飞");
        list.add("雷涛");
        list.add("张小林");
        page.addAll(list);
    }
}

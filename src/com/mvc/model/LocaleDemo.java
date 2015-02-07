package com.mvc.model;

import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args){
        Locale loc1 = Locale.getDefault();
        System.out.println(loc1);
        Locale lo2 = new Locale("en","US");
        System.out.println("dfsdf:"+lo2.getDisplayCountry());
    }
}

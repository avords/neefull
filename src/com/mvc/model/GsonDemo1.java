package com.mvc.model;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class GsonDemo1 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        String sql = "[{beanName:rep1,sql:'select * from yes'},{beanName:rep2,sql:'select * from yes'}]";
        Gson gson = new Gson();
        Object[] obj = gson.fromJson(sql, Object[].class);
        System.out.println(obj[0]);
    }
}

package com.mvc.model;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonDemo {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        String sql = "[{beanName:rep1,sql:'select * from yes'},{beanName:rep2,sql:'select * from yes'}]";
        Type listType = new TypeToken<LinkedList<SqlBean>>(){}.getType();
        Gson gson = new Gson();
        LinkedList<SqlBean> users = gson.fromJson(sql, listType);
        Iterator<SqlBean> iterator=users.iterator();
        while(iterator.hasNext()){
            SqlBean sqlBean = iterator.next();
            map.put(sqlBean.getBeanName(), sqlBean.getSql());
            System.out.println(sqlBean.getBeanName()+":"+sqlBean.getSql());
        }
    }
}

package com.lanou.model;

import com.sun.javaws.Main;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        List list2 = new ArrayList();
        list2.add(3);
        list2.add(4);
        List list3 = new ArrayList();
        list3.add(list);
        list3.add(list2);
        System.out.println(list3);

        String string = "19.00";
        String string2 = "18.00";
        Float aFloat = Float.valueOf(string);
        Float aFloat1 = Float.valueOf(string2);
        System.out.println(aFloat);
        System.out.println(aFloat1);

        if (aFloat > aFloat1){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

package com.cloud.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LeiZhaosh on 2017/7/21.
 */
public class LamdaMain {


    public static void main(String[] args) {


       /* // Java 8之前：
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();
        //Java 8方式：
        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();*/

        /*List<String> list = new ArrayList<String>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");

        list.forEach( n -> System.out.println(n));

        list.forEach(System.out::println);*/


        
    }

    public static void testList (){
        List<String > list = new ArrayList<String>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");
        list.add("15");
        list.add("16");
        list.add("17");
        list.add("18");
        list.add("19");
        list.add("20");
        list.add("21");
        list.add("22");
        list.add("23");

        List<List<String>> lists = dataTransferListData(list , 10);

        System.out.println(lists.get(2).toString());
    }

    public static <T> List<List<T>> dataTransferListData(List<T> data ,int count){
        List<List<T>> list = new ArrayList<List<T>>();
        int size = data.size();
        int d = size % count;
        int fcount = size / count; // 几次
        if (d > 0) {
            fcount = fcount + 1;
        }
        List<T> temList = null;
        for (int i = 0; i < fcount; i++) {
            // 组装报文
            if(i==fcount-1){
                temList = data.subList(i*count, size);
            }else{
                temList = data.subList(i*count, (i+1)*count);
            }
            list.add(temList);
        }
        return list;
    }
}

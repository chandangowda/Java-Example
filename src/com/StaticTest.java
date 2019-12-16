package com;

public class StaticTest {

    public static StaticTest test;

    public static String trackingId;


    public StaticTest getInstance(){

        if(test==null){
            test=new StaticTest();
        }
        return test;
    }
}

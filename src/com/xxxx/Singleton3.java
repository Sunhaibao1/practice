package com.xxxx;

/**
 * @author
 * @create 2022--02--08  20:21
 */
//饿汉式

    //饿汉式是线程安全的

public class Singleton3 {
    private static Singleton3 instance= new Singleton3();

    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        return instance;
    }

}

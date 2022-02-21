package com.xxxx;

/**
 * @author
 * @create 2022--02--08  20:12
 */

//懒汉式
      //线程安全
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){

    }
    public static Singleton2 getInstance(){
        if(instance == null){
            synchronized (Singleton2.class){
                instance = new Singleton2();
            }
        }
        return instance;
    }
}

package com.xxxx;

/**
 * @author
 * @create 2022--02--08  20:06
 */
//单例模式
    //懒汉式 线程不安全
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

   public static Singleton1 getInstance(){
        if(instance == null){
            Singleton1 instance = new Singleton1();
        }
        return instance;
   }
}



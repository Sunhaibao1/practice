package com.test;

import com.xxxx.Singleton2;
import org.junit.Test;

/**
 * @author
 * @create 2022--02--08  20:18
 */

public class Singleton2Test {
    @Test
    public void test1(){
        Singleton2 ins = Singleton2.getInstance();
        System.out.println(ins);
    }
}

package com.test;

/**
 * @author
 * @create 2022--02--09  21:22
 */
public class TestDemo {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        int k=0;
        for (int z=0;z<5;z++) {
            if((++x>2)&&(++y>2)&&(k++ >2)){
                x++;
                ++y;
                k++;
            }

        }
        System.out.println(x+""+y+""+k);
    }
}

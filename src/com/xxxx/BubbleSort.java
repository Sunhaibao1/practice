package com.xxxx;

/**
 * @author
 * @create 2022--02--08  16:15
 */

//冒泡排序
public class BubbleSort {
    public static void main(String[] args){
        int[] a = {87,45,78,32,17,65,53,9,122,1,88};
        printArray(a);
        bubbleSort2(a);
        printArray(a);
    }
    public static void bubbleSort2(int[] a){
        int i=0;
        int j=0;
        for( i=0;i<a.length-1;i++){
            for(j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    swapArray(j,j+1,a);
                }
            }
        }
    }

    public static void swapArray(int i,int j,int[] a){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void printArray(int[] array){
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}

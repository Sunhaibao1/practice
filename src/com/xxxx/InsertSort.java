package com.xxxx;

/**
 * @author
 * @create 2022--02--16  21:35
 */
public class InsertSort {
    public static void main(String[] args){
        int[] a = {87,45,78,32,17,65,53,9,122,1,88};
        printArray(a);
        insertSort(a);
        printArray(a);
    }
    public static void insertSort(int[] a){
        int i=0;
        int j=0;
        for( i=1;i<a.length;i++){
            int temp=a[i];
            if(a[i-1]>a[i]){
                for(j=i-1;j>=0;j--){
                    if(temp<a[j]){
                        a[j+1]=a[j];
                        // a[j]=temp;
                    }else{
                        break;
                    }
                }
                a[j+1]=temp;
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
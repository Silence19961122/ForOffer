package com.ni.algorithm;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

/**
 * Created by losil_000 on 2017/11/20.
 */
public class QuickSort {

//    public static  int partition(int [] array ,int lo,int hi)
//    {
//        int key=array[lo];
//        while (lo<hi)
//        {
//            while (hi>lo&&array[hi]>=key)
//            {
//                hi--;
//            }
//            //swap(array[hi],array[lo]);
//            array[lo]=array[hi];
//            while (hi>lo&&array[lo]<=key)
//            {
//                lo++;
//            }
//            //swap(array[hi],array[lo]);
//            array[hi]=array[lo];
//
//        }
//        array[lo]=key;
//        return lo;
//
//    }

    public int partition(int [] arr,int lo,int hi) {
        int key = arr[lo];
        while (lo < hi) {

            while (hi > lo && arr[hi] > key)
                hi--;
            arr[lo] = arr[hi];

            while (lo < hi && arr[lo] < key) {
                lo++;
            }
            arr[hi] = arr[lo];
        }

            arr[lo] = key;
            return lo;
        }












    public static void main(String[] args) {
        int[] a={9,1,8,13,4,2,1,0};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(a,0,a.length-1);
        for (int b:a)
        {
            System.out.println(b);

        }
    }


    public void sort(int [] array,int low,int high)
    {
        if (low<high)
        {
            int key=partition(array,low,high);
            sort(array,low,key-1);
            sort(array,key+1,high);
        }
    }


    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
    }
}

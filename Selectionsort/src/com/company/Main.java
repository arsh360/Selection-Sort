package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, -32, 12, 30, 25};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getmaxIndex (arr, 0, last);
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    static int getmaxIndex (int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}

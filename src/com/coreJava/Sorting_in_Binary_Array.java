package com.coreJava;
import java.util.Arrays;
public class Sorting_in_Binary_Array {
    public static void sort_binary_arr(int[] b_arr)
    {
        int a = 0;

        for (int i = 0; i < b_arr.length; i++)
        {
            if (b_arr[i] == 0) {
                b_arr[a++] = 0;
            }
        }

        for (int i = a; i < b_arr.length; i++) {
            b_arr[a++] = 1;
        }
    }

    public static void main (String[] args)
    {
        int b_arr[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Original array: "+Arrays.toString(b_arr));
        sort_binary_arr(b_arr);
        System.out.println("After sorting: "+Arrays.toString(b_arr));

    }
}

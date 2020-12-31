package com.Sorting.SortingBinaryArray;

import java.util.Arrays;
// Sorting Binary Array in Linear Time
public class SortingBinaryArray {
    // Method to return sorted Binary Array
    public static int[] SortBinary(int[] a){

        // k store index of next free space
        int k=0;

        // if the current element is zero
        // fill 0 to the next free space
        for (int i=0;i< a.length;i++) if (a[i] == 0) a[k++] = 0;

        // fill remaining spaces of Array with 1
        for (int i=k;i< a.length;i++) a[i] = 1;
        return a;
    }
    public static void main(String[] args) {
        int[] a = {1,0,1,1,0,1,1,1,0,0,1};
        System.out.println("Unsorted Binary Array : "+ Arrays.toString(a));
        System.out.println("Sorted Binary Array  :  "
                +Arrays.toString(SortBinary(a)));
    }

}

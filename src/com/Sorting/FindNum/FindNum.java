package com.Sorting.FindNum;

import java.util.Arrays;
// Program to Find Out Missing Numbers in a sorted Array of Naturals Number

public class FindNum {
    static int[] num(int[] array){
        int n = array[array.length-1];
        int size = 1;
        int[] find = new int[size];
        for (int i = 1, j = 0, m = 0; i <= n; i++)
        {
            if (array[j] == i){
                j++;
            }else {
                find[m] = i;
                m++;
                // size of array to store missing number increased Dynamically
                find = Arrays.copyOf(find, find.length + size);
            }
        }
        return find;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5,7,8,9,11,12};
        System.out.println("Missing Numbers in "+Arrays.toString(array)+" is : "
                +Arrays.toString(FindNum.num(array)));
    }
}

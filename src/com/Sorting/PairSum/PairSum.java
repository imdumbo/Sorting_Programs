package com.Sorting.PairSum;

import java.util.Arrays;
import java.util.HashMap;

public class PairSum {
    static void Sum(int[] arr, int sum){
        HashMap hash = new HashMap();
        for (int i = 0; i< arr.length; i++){
            if (hash.containsKey(sum-arr[i])){
                int a = (int)hash.get(sum-arr[i]);
                System.out.println("Pair found at index "+a+" and "+i+" are " +
                        "{" +arr[a]+","+arr[i]+"}");
            }
            hash.put(arr[i],i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,9,17,18};
        int sum = 12;
        System.out.println("Array is : "+ Arrays.toString(arr));
        System.out.println("sum is : "+sum);
        Sum(arr,sum);

    }
}

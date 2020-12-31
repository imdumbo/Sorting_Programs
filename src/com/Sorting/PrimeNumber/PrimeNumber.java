package com.Sorting.PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimeNumber {
    static void find(int num1, int num2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int temp =0;
        for (int i = num1; num2 > i; i++) {
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0) { temp++;
                    break;
                }
            if (temp == 0) arr.add(i);
            else temp = 0;
        }
        System.out.println(arr);
    }
    public static void main(String[] args) throws IOException {
        System.out.println("-----------Prime Numbers--------------");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("First Number : ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.print("Second Number : ");
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("Prime Numbers Between "+num1+" and "+num2+" are : ");
        PrimeNumber.find(num1,num2);
    }

}


// System.out.println("10th Prime Number is : "+arr.get(9)); // this will give prime number at 10th position
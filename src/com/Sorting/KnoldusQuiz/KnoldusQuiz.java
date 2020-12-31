package com.Sorting.KnoldusQuiz;

// Create a method that take a String as a Input and return True if :-
//  ==> String must have 4 to 25 letters
//  ==> First letter of String must be letter
//  ==> String must ends with "_"
//  ==> Allowed character in String is letter, number and _

import java.util.Scanner;

public class KnoldusQuiz {
    public static boolean StringCheck(String str){
        boolean flag= false;
        // checking String have 4 to 25 letters only
        if (str.length()>3 && str.length()<26){
            // converting String into char Array
            char[] charArray = str.toCharArray();
            //checking first char is letter
            if (Character.isLetter(charArray[0])){
                //checking last Char must be "underscore"
                if (str.endsWith("_")){
                    // Allowed char must be letter number and _
                    flag = str.matches("[A-Za-z0-9_]*$");
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter String to Check : ");
        String str = sc.nextLine();
        System.out.println("Result is : "+StringCheck(str));
    }

}

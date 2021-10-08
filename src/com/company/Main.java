package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main{


    public static String reverse(String str)
    {

        if (str == null || str.equals("")) {
            return str;
        }


        int n = str.length();


        char[] temp = new char[n];


        for (int i = 0; i < n; i++) {
            temp[n - n+ i] = str.charAt(i);
           // System.out.println("Temp " + temp)
        }


        return String.copyValueOf(temp);
    }


    public static void main(String[] args) {
        char[] message = {'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l'};
//
        String str = String.valueOf(message);
        System.out.println("The messageString str is " + str);

        String[] messageString = str.split(" ");
        System.out.println("The messageString string is " + messageString.length);

        StringBuilder finalString = new StringBuilder();
        for (int k = 0; k < messageString.length; k++){
            str = reverse(messageString[messageString.length- 1-k]) + " ";
            finalString.append(str);
            System.out.println("The reversed string is " + finalString);
    }
        System.out.println("The reversed string is1 " + finalString);


    }
}



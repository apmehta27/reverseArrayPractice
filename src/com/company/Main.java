package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main{


    public static String reverse(String[] messageString)
    {
        String finalString = new String();
        for (int k = messageString.length-1; k >=0 ; k--){
            //     str = reverse(messageString[messageString.length- 1-k]) + " ";
            finalString = finalString.concat(messageString[k]) + " ";
            System.out.println("The reversed string is " + finalString);
        }
        return finalString;
    }


    public static void main(String[] args) {
        char[] message = {'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l'};
//
        String str = String.valueOf(message);
        System.out.println("The messageString str is " + str);

        String[] messageString = str.split(" ");
        System.out.println("The messageString string is " + messageString.length);

        String reverseString = reverse(messageString);

        System.out.println("The reversed string is1 " + reverseString);


    }
}

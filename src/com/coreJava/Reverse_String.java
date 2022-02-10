package com.coreJava;
import java.util.Scanner;
public class Reverse_String {
    public static void main(String args[])
    {
        String x;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        x=sc.nextLine();                    //string by user
        System.out.print("reverse string is: ");
        for(int i=x.length();i>0;--i)
        {
            System.out.print(x.charAt(i-1));            //printing the character at index i-1
        }
    }
}

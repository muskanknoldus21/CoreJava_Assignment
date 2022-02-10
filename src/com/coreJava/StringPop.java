package com.coreJava;
import java.util.Scanner;
public class StringPop {
    public static boolean pop (String str){

        int len = str.length();

        for (int x = 0; x < len - 2; x++) {
            if (str.charAt(x) == 'p' && str.charAt(x + 2) == 'p')
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to check");

        String str1 = sc.nextLine();
        System.out.println(pop(str1));
    }
}

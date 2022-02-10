package com.coreJava;
import java.io.*;
public class Occurences_of_Char{
    static int CountString(char ch, String str)
    {
        if(str.length()==0)
            return 0;
        int c = 0;
        if(str.charAt(0)==ch)
            c++;
        c+=CountString(ch,str.substring(1));


        return c;
    }
    public static void main (String[] args) {
        String s= "AdvanceJava";
        char c = 'a';
        System.out.println(CountString(c,s));
    }
}

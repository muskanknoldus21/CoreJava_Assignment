package com.coreJava;

public class Remove_char {
    public static void removeChar(String s, char c){
        int a,
                count = 0,
                n = s.length();

        char [] x = s.toCharArray();

        for (int j = a = 0; j < n; j++){
            if (x[j] != c)
                x[a++] = x[j];
            else
                count++;
        }

        while (count > 0){
            x[a++] = '\0';
            count--;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        String s = "abcdefabcdeabcdaaa";
        removeChar(s, 'a');
    }
}

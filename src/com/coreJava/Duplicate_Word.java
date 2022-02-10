package com.coreJava;

public class Duplicate_Word {
    public static void main(String[] args)
    {
        String s = "betty bought butter but the butter was bitter so betty bought another butter to make the bitter butter better.";
        int c;
        s = s.toLowerCase();


        // splitting words using regex
        String[] words = s.split(" ");
        System.out.println("Duplicate words in string: ");

        // here we are iterating in Array
        for (int j = 0; j < words.length - 1; j++) {
            c = 1;
            for (int k = j+1; k < words.length; k++) {

                if (words[j].equals(words[k])) {
                    c++;
                    words[k] = "0";
                }
            }
            if(c > 1 && words[j] != "0")
                System.out.println(words[j]);
        }
    }
}

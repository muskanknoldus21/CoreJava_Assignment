package com.coreJava;
import java.util.Scanner;
import java.util.Scanner;
class NumbersInWords{
    String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    String[] tens = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    String[] hundreds = { "", "Thousand", "Million", "Billion" , "Trillion" , "Quadrillion" ,"Quintillion"};

    public String numbertowords(long digit ){
        if (digit== 0)
            return "Zero";
        String result = "";
        int i = 0;
        while (digit > 0) {
            if (digit% 1000 != 0) {
                result = solve(digit % 1000) + tens[i] + " " + result;
            }
            digit/= 1000;
            i++;
        }
        return result.trim();
    }

    public String solve(long digit) {
        if (digit== 0)
            return "";
        if (digit< 20) {
            return ones[(int)(digit % 20)] + " ";
        } else if (digit< 100) {
            return tens[(int)(digit / 10)] + " " + solve(digit% 10);
        } else {
            return ones[(int)(digit / 100)] + " Hundred " + solve(digit % 100);
        }
    }

}

public class NumberToWords{
    public static void main(String[] args)
    {   long n;
        NumbersInWords num= new NumbersInWords();
        Scanner ic= new Scanner(System.in);
        try{
            n=ic.nextLong();
        }
        finally{
            ic.close();
        }
        System.out.println(num.numbertowords(n));
    }
}
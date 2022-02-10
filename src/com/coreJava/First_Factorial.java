package com.coreJava;
import java.util.Scanner;
public class First_Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        System.out.println("Output: " + FirstFactorial(s.nextInt()));
    }

    private static int FirstFactorial(int n) {
        if (n == 0) return 1;
        return (n == 1 ? 1 : n * FirstFactorial(n - 1));
    }
}

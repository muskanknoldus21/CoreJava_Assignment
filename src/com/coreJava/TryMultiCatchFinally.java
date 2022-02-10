package com.coreJava;
import java.util.Scanner;
public class TryMultiCatchFinally {
    public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            try
            {
                int n = Integer.parseInt(s.nextLine());

                if (100 % n == 0)
                    System.out.println(n + " is a factor of 100");
            }
            catch (ArithmeticException ex)
            {
                System.out.println("Arithmetic " + ex);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Number Format Exception " + ex);
            }
        }
}

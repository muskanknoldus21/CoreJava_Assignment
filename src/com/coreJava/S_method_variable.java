package com.coreJava;

public class S_method_variable {
    // static variable
    static int age= 22;

    // static block
    static
    {
        String FirstName="Muskan";
        System.out.println("First Name: "+FirstName);
    }

    // static method
    static void Lastname()
    {

        String LastName="Jain";
        System.out.println("Last Name: "+LastName);
    }

    public static void main(String[] args)
    {
        Lastname();
        System.out.println("Age: "+age);
    }
}

package com.coreJava;

class Regards {

    // Method
    void regard()
    {
        // Print statement whenever method is called
        System.out.println("hey!");
    }
}

class Q14bNoClassFoundError {
    public static void main(String args[])
    {
        Regards rg = new Regards();


        rg.regard();
    }
}
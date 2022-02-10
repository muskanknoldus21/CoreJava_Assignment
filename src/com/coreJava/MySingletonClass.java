package com.coreJava;
public class MySingletonClass {

    private static MySingletonClass myObj;

    static{
        myObj = new MySingletonClass();
    }

    private MySingletonClass(){

    }

    public static MySingletonClass getInstance(){
        return myObj;
    }

    public void test(){
        System.out.println("Hey...its gonna work!!!");
    }

    public static void main(String a[]){
        MySingletonClass ms = getInstance();
        ms.test();
    }
}

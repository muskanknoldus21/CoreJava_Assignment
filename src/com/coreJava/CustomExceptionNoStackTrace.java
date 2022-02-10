package com.coreJava;
class ExceptionForAtm extends Exception{
    public ExceptionForAtm(String msg)
    {
        super(msg);
    }
}
public class CustomExceptionNoStackTrace {
    static void toValidate(int p) throws ExceptionForAtm{
        if(p > 1)
        {
            throw new ExceptionForAtm("Person is not allowed for Entry!!");
        }
        else
        {
            System.out.println("Welcome!!");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            toValidate(3);
        }

        catch(ExceptionForAtm e)
        {
            System.out.println("Caught the exception");
            System.out.println("Exception occured "+ e);
        }

    }
}

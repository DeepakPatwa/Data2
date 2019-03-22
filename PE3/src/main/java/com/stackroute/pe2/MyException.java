package com.stackroute.pe2;

public class MyException extends Exception{
    public MyException(String s)
    {
        super(s);
    }
    public static void main(String args[])
    {
        try
        {
            // Throw an object of user defined exception
            throw new MyException("Exception is thrown");
        }
        catch (MyException ex)
        {
            System.out.println("Caught the exception");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Final block");
        }
    }
}

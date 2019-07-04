package org.mehri.java.algo;

public class Recursion
{


    public  int getTriangularNumR(int number)
    {
        if(number < 1)
        {
            return 1;
        }

        else
        {
            int result  =  number + getTriangularNumR(number-1);
            System.out.println("Result: "+ result+" => " + number +" + getTriangleNumber ("+ number +"-1)");
            return result;
        }

    }

    public int Fibonacci(int number)
    {

        if(number <=1)
            return 1;

        else
        {
            int result  =  Fibonacci(number-1)+ Fibonacci(number-2);
            System.out.println("Result: "+ result+" => " + "Fibonacci ( " +number + "-2)"+" + Fibonacci("+ number +"-1)");
            return result;
        }

    }

    public int Factorial(int number)
    {
        if(number < 1)
        {
            return 1;
        }
        else
        {
            int result  = number * Factorial(number -1);
            System.out.println("Result: "+ result+" => " + number +  " * Factorial ("+ number +"-1)");
            return result;
        }
    }

    //0 1 1 2 3 5 8 13 21 34 55

}

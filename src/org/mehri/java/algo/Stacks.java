package org.mehri.java.algo;

import java.util.Arrays;

public class Stacks
{
    public int topOfStack;
    public String[]  theArray;
    private  int arraySize;

    public Stacks(int size)
    {
        arraySize = size;
        theArray = new String[size];
        topOfStack =  -1;
        Arrays.fill(theArray,"-1");
    }

    //  10 29 30 28 3 47 23 22 4 18 29


    public void pop()
    {
        if(topOfStack!=-1)
        {
            System.out.println("Element of stack at the top was removed: " + theArray[topOfStack]);
            theArray[topOfStack] = "-1";
            topOfStack--;
        }
        else
        {
            System.out.println("There is no element at the stack");
        }


    }

    public void push(String value)
    {

        if(topOfStack + 1 < arraySize)
        {
            topOfStack ++;
            theArray[topOfStack] = value;
        }
        else
        {
            System.out.println("The stack is full, there is no space to add new value");
        }

    }


    public  String peek()
    {
        if(topOfStack!=-1)
        {
            return theArray[topOfStack];
        }

        else
        {
            System.out.println("Stack is empty");
            return null;
        }

    }

    public void printStack()
    {
        if(topOfStack!=-1)
        {

                for (int i = 0; i <= topOfStack; i++)
                {
                    System.out.print(theArray[i] + "  ");
                }

            System.out.println();
        }

        else

        {
            System.out.println("Stack is empty");
        }

    }

}

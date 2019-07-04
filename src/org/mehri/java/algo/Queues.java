package org.mehri.java.algo;

import java.util.Arrays;

public class Queues
{

    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

   public Queues(int size)
    {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }



    public void insert(String input)
    {
        if(numberOfItems+1 <= queueSize)
        {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT: "+ input+ " was added");
        }

        else
        {
            System.out.println("Queue is full");
        }
    }

    public  void remove()
    {
        if(numberOfItems >0)
        {

            System.out.println("REMOVE " + queueArray[front]+ " was removed");
            queueArray [front] = "-1";
            front++;
            numberOfItems--;
        }
    }

    public void peek()
    {
        System.out.println("The first element of queue is  : " + queueArray[front]);
    }

    public void displayQueue()
    {

        for(int i = 0; i <= numberOfItems; i++)
        {
            System.out.print( queueArray[i] +" ");
        }
        System.out.println();
    }

    public void priorityInsert(String input)
    {
        int i ;

        if(numberOfItems == 0)
        {
            insert(input);
        }

        else
        {
            for(i = numberOfItems; i > front; i--)
            {
                queueArray[i]= queueArray[i-1];
            }

            queueArray[i] = input;

        }
    }


}

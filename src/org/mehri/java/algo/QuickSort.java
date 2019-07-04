package org.mehri.java.algo;

//  Fastest algorithm
//  Partions the array until its sorted
//
public class QuickSort
{

    int []  theArray;
    int size;


    public QuickSort(int paramSize)
    {
        this.size = paramSize;
        theArray = new int[size];
        generateRandomArray();
        printTheArray();
    }

    public void generateRandomArray()
    {

        int min= 1;
        int max = 100;

        int range  = max - min + 1;

        for(int i = 0;  i < size; i++)
        {
            theArray[i] = (int) (Math.random() * range) + min;
        }
    }

    public void printTheArray()
    {
        for(int i = 0; i <size;i++)
        {
            System.out.print(theArray[i]+" ");
        }
        System.out.println();
    }

    public  void run()
    {
        sort(0,  theArray.length-1);
    }

    public void sort(int leftPointer, int rightPointer)
    {
        if(leftPointer>rightPointer)
        {
           return;
        }

        int midpoint = (rightPointer/2);
        int pivot = theArray[midpoint];

        System.out.println("Pivot value : "+ pivot);

        int index = partioning(leftPointer, rightPointer, pivot, theArray);

        sort(leftPointer, index-1);

           //

        sort(index+1, rightPointer);
        printTheArray();
    }


    public int  partioning(int leftPointer, int rightPointer, int pivot, int[] array)
    {
        while(leftPointer < rightPointer)
        {

            if(array[leftPointer]>=pivot && array[rightPointer]<=pivot)
            {
                swap(leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;

            }

            if(array[leftPointer]<pivot)
            {
                leftPointer++;
            }

            if(array[rightPointer]>pivot)
            {
                rightPointer--;
            }
        }
        return leftPointer;
    }

    private void swap(int firstIndex, int secondIndex)
    {
        int temp = theArray[firstIndex];
        theArray[firstIndex] = theArray[secondIndex];
        theArray[secondIndex]= temp;
    }
}

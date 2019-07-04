package org.mehri.java.algo;

public class MergeSort

{
    int[]  sampleArray;
    int sizeOfArray;


    public MergeSort(int size)
    {
         sizeOfArray = size;
         sampleArray = new int[sizeOfArray];
    }

    public void createRandomArray()
    {
        int max = 100;
        int min = 2;
        int range = max - min +1;

        for(int i = 0; i < sizeOfArray; i++)
        {
            sampleArray[i] = (int)(Math.random()*range)+min;
        }

    }

    public void printArray()
    {
        System.out.println("Printing array ...");

        for(int i =0; i<sizeOfArray; i++)
        {
            System.out.print( sampleArray[i]+" ");
        }
    }


    public void run()
    {
        //createRandomArray();
        //System.out.println(" Before sorting the array");
        printArray();
        sampleArray[0] = 4;
        sampleArray[1]=  2;
        sampleArray = sortTheArray(sampleArray);
        System.out.println(" After sorting the array");
        printArray();
    }

    public int[] sortTheArray  (int [] paramArray)
    {

        if(paramArray.length<=1)
        {
            return paramArray;
        }

        int midpoint  = paramArray.length/2;
        int [] leftArray = new int[midpoint];
        int [] rigtArray;

        if((paramArray.length%2)==0)
        {
            rigtArray = new int[midpoint];
        }
        else
        {
            rigtArray = new int [midpoint+1];
        }



        for(int i = 0; i< leftArray.length; i++)
        {
            leftArray[i] = paramArray[i];
        }


        for(int j = 0; j < rigtArray.length; j++)
        {
            rigtArray[j] = paramArray[midpoint+j];
        }


        leftArray = sortTheArray(leftArray);
        rigtArray = sortTheArray(rigtArray);

        int [] result  = mergeTheArray(leftArray, rigtArray);

        return result;
    }


    private int[] mergeTheArray(int[] left, int[] right)
    {
        int[] result = new int[left.length+right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer= 0;

        while(leftPointer < left.length || rightPointer < right.length)
        {
            if(leftPointer < left.length && rightPointer < right.length)
            {
                if(left[leftPointer]< right[rightPointer])
                {
                    result[resultPointer++] = left[leftPointer++];
                }
                else
                {
                    result[resultPointer++] = right[rightPointer++];
                }
            }

            else if(leftPointer < left.length)
            {
                result[resultPointer++] = left[leftPointer++];
            }
            else
            {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

}

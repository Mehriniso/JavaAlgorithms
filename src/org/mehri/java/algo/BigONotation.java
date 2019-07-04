package org.mehri.java.algo;

public class BigONotation
{

    int arraySize;
    int [] theArray;
    int startTime;
    int endTime;


    public  BigONotation( int paramSize)
    {
        arraySize = paramSize;
        theArray = new int[arraySize];
        generateRandomArray();
        printTheArray();
        QuickSort(0, theArray.length);
        printTheArray();
    }

    public  void generateRandomArray()
    {
        for(int i = 0; i < arraySize; i++) {

            theArray[i] = (int)(Math.random()*99)+1;
        }

    }

    public  void printTheArray()
    {
        System.out.println( "Printing the array");

        for(int i = 0; i < arraySize; i++)
        {
            System.out.print(theArray[i]+ " ");
        }
        System.out.println();

    }
    //1

   //O(nlogn) Quick Sort


    public void  QuickSort ( int firstIndex, int lastIndex)

    {
        if(firstIndex>lastIndex)
        {
            return;
        }

        else
        {
            int pivot = theArray[theArray.length/2];
            int index = partioning(pivot, firstIndex,lastIndex);
            QuickSort(firstIndex, index-1);
            QuickSort(index+1, lastIndex);
        }

    }



    public int partioning(int pivot, int firstIndex, int lastIndex)
    {
        while(firstIndex<lastIndex)
        {
            while (theArray[firstIndex] < pivot) {
                firstIndex++;
            }
            while (theArray[lastIndex] > pivot) {
                lastIndex--;
            }

            if(theArray[firstIndex]<= pivot && theArray[lastIndex]>= pivot)
            {
                swap(firstIndex,lastIndex);
            }
        }

        return lastIndex;
    }

    public void swap(int firstIndex, int lastIndex)
    {
        int temp = theArray[firstIndex];
        theArray[firstIndex] = theArray[lastIndex];
        theArray[lastIndex] = temp;
    }

//
//    public int partionArray(int left, int right)
//    {
//        while(left <= right)
//        {
//
//
//
//
//
//        }
//
//    }

    //  6 3 8 2
    //  2  3  8               6








    //  index





    // 6 5 4 3

    //       right




    // left  index
    // index+1, right


    // O(logn) <----> BinarySearch

}
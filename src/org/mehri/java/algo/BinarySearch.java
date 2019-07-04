package org.mehri.java.algo;

public class BinarySearch {
    private int[] theArray;

    public BinarySearch()
    {
        theArray = new int[10];
        generateRandomArray();
        printTheArray();
        
    }

    public void generateRandomArray() {

        for (int i = 0; i < 10; i++)
        {
            theArray[i] = 2;
        }
    }
    public void printTheArray() {

        System.out.println("Printing the element");
        for (int i = 0; i < 10; i++)
        {
        System.out.print(theArray[i]+ " ");
        }

        System.out.println();

    }


    //     0 1 2 3 4 5 6 7 8 9


    // 1. low = 0, high = 10   mid = 5
    // 2. low = 6   high = 10  mid = 8
    // 3. low = 6   high = 7   mid = 6
    // 4. low = 7   high = 7   mid = 7

    public int findElement(int element)
    {
        int result = -1;

        int low = 0;

        int high = theArray.length-1;

        while(low <= high)
        {
            int mid = (low+high)/2;

            if(theArray[mid] == element )
            {
                result = mid;
                low = mid+1;
            }

            else if (theArray[mid] > element)
                high = mid-1;

            else
                low  = mid+1;

        }

        return result;
    }
/*
    public int countNumberOfElements(int number)
    {

    }
  */

//



}

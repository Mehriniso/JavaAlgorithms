package org.mehri.java.algo;

public class QuickSort2 {

    private int[] theArray;

    public  QuickSort2(int [] paramArray)
    {
        theArray = paramArray;
         sort(0, theArray.length-1);
         printArray();
    }

    public void  sort(int first, int last)
    {
        if(first<last)
        {
            int index =  partioning(first, last);
            sort(first, index-1);
            sort(index+1, last);
        }
    }

    public  void printArray()
    {

        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }


    public int partioning(int firstIndex, int lastIndex)
    {
        int index = firstIndex;

        int pivot = theArray[lastIndex];

        for(int i = firstIndex; i< lastIndex; i++)
        {
            if(theArray[i]<= pivot)

            {
                swap(index, i);
                index++;
            }

        }

        swap(index, lastIndex);
        return index;
    }

    public void swap(int firstindex, int secondindex)
    {
        int temp = theArray[firstindex];


        theArray[firstindex] = theArray[secondindex];
        theArray[secondindex] = temp;

    }
}

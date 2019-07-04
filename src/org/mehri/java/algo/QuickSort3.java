package org.mehri.java.algo;

public class QuickSort3
{

    private int [] theArray;

    private int size;


    public QuickSort3(int size)
    {
        this.size = size;
        theArray = new int[size];
        generateRandomArray();
        printTheArray();
        sort(0, theArray.length-1);
        printTheArray();

    }

    private void generateRandomArray()
    {

//        for(int i = 0; i<size; i++)
//        {
//            theArray[i]=(int)(Math.random()*(10-2))+2;
//        }

        theArray[0] = 6;
        theArray[1] = 3;
        theArray[2] = 6;
    }

    private void printTheArray()

    {
       System.out.println("Printing the array: ");

        for(int i = 0; i<size; i++)
        {
            System.out.print(theArray[i]+" ");
        }
    }


    private  void  sort (int  left, int right)
    {
        if(left>=right)
        {
            return;
        }

        else
        {
            //int pivot = theArray[(left+right)/2];
            int pivot = 6;
            int index  = partioning(left, right, pivot);
            sort(left, index-1);
            sort(index+1, right);
        }

    }


    public int partioning(int left, int right, int pivot)
    {
        while(left < right)
        {
            if(theArray[left]>=pivot && theArray[right]<= pivot)
            {
                swap(left, right);
                left++;
                right--;
            }

            if(theArray[left] < pivot)
                left++;

            if(theArray[right] > pivot)
                right--;
        }
        return left;
   }

    public void swap(int firstIndex, int secondIndex)
    {
        int temp = theArray[firstIndex];
        theArray[firstIndex] = theArray[secondIndex];
        theArray[secondIndex] = temp;
    }
}

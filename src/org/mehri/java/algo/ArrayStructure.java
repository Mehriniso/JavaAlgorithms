package org.mehri.java.algo;

import javax.sound.midi.SysexMessage;

public class ArrayStructure {
    private int[] theArray =  {8, 22, 7, 9,31, 19, 5, 13};
    private int arraySize = 8;

    public void generateRandomArray() {
//        for (int i = 0; i < arraySize; i++) {
//            theArray[i] = (int) (Math.random() * 10) + 10;
//        }
//        theArray  = {8, 22, 7, 9,31, 19, 5, 13};

    }




    public void printArray() {
        System.out.println("");

        for(int i = 0; i< arraySize; i++)
        {
            System.out.print("| "+ i+ " | ");
            System.out.println(theArray[i]+" | ");
        }

        System.out.println();
    }

    public boolean doesArrayContainThisValue(int searchValue)
    {
        boolean valueFound = false;

        for(int i = 0; i<arraySize; i++)
        {
            if(theArray[i]== searchValue)
            {
                valueFound = true;
            }
        }
     //   if(valueFound)

        return valueFound;
    }

//    public int getValueAtIndex(int index)
//    {
//
//    }


    public void insertValue(int value)
    {
        if(arraySize < 50 )
        {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public  void deleteIndex(int index)
    {

        for(int i = index; i < arraySize; i++)
        {
            theArray[index] = theArray[index+1];
        }
        arraySize--;
    }

    public String linearSearchWithValue(int searchValue)
    {
        String valuesFoundOnIndexes = "";
        boolean isValueExist = false;

        System.out.println("Values found on following indexes");


        for(int i =  0; i < arraySize; i++ )
        {
            if(theArray[i]== searchValue)
            {
                isValueExist = true;
                valuesFoundOnIndexes += i + " ";

            }
        }

        if(!isValueExist)
        {
            System.out.println("None");
            return valuesFoundOnIndexes;
        }

        System.out.println(valuesFoundOnIndexes);
        return valuesFoundOnIndexes;
    }

    int counter = 0;

    public void bubbleSort()
    {
        for(int i = 0; i <arraySize; i++)
        {
            for(int j = 0;  j < arraySize-1; j++)
            {

                if(theArray[j]> theArray[j+1])
                {
                    counter++;
                    swapTheValue(j,j+1);
                    System.out.println("counter " +counter);
                }
            }
        }
    }

    public void binarySearchForValue(int searchValue)
    {
        int lowIndex = 0;
        int highIndex = arraySize - 1;

        while(lowIndex <=  highIndex)
        {
            int middleIndex = (lowIndex+highIndex) / 2;
            if(theArray[middleIndex] > searchValue)
            {
                highIndex  =  middleIndex - 1;

            }
           else if ( theArray[middleIndex] < searchValue)
            {
                lowIndex  =  middleIndex + 1;
            }
            else
            {
                System.out.println("The value is found at index :"+ middleIndex );
                        lowIndex = highIndex+1;
            }
        }

    }

    public  void selectionSort()
    {
        int minimum = 0;

        for(int i = 0; i < arraySize; i++)
        {
            minimum = i;

            for(int j = i;  j < arraySize; j++)
            {
                if(theArray[minimum] > theArray [j])
                {
                    minimum = j;
                }
            }

            swapTheValue(i, minimum);
        }
    }

    

    public void  insertionSort()
    {

        for(int i = 1; i < arraySize; i++)
        {
            for(int j = i; j > 0; j--)
            {

               if(theArray[j] < theArray[j-1])
               {
                   swapTheValue(j, j-1);
               }

            }
        }
    }


    public void swapTheValue(int firstIndex, int secondIndex)
    {
        int temp = theArray[firstIndex];
        theArray[firstIndex] = theArray[secondIndex];
        theArray[secondIndex] = temp;
    }




    public void printHorzArray(int i, int j){

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        // END OF FIRST PART


        // ADDED FOR BUBBLE SORT

        if(j != -1){

            // ADD THE +2 TO FIX SPACING

            for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");

            System.out.print(j);

        }


        // THEN ADD THIS CODE

        if(i != -1){

            // ADD THE -1 TO FIX SPACING

            for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");

            System.out.print(i);

        }

        System.out.println();

    }




}

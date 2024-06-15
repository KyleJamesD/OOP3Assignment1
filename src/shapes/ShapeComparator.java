/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.util.Comparator;

/**
 *
 * @author kyled
 */
public class ShapeComparator<E extends Shape> implements Comparator<E>
{
    public int size;
    public E []data;
    public String comparetype;
    public String sortalgo;

    public int getSize() {
        return size;
    }

    public E[] getData() {
        return data;
    }

    public ShapeComparator(E[] data, String comparetype, String sortalgo) {
        this.data = data;
        this.comparetype = comparetype;
        this.sortalgo = sortalgo;
        this.size = data.length;
    }
    
    
     //end constructor and fields      
     //begin sorting algos
    
        @Override
        public int compare(E s1, E s2)
        {
            return compareShapes(s1, s2, comparetype);
        }
    
        
  
        public int compareShapes(Shape s1, Shape s2, String comparetype)
        {
            switch(comparetype.toLowerCase())
            {
                case "v":
                    if (s1.calcVolume() > s2.calcVolume())
                    {return 1;}
                    else if (s1.calcVolume() < s2.calcVolume())
                    {return-1;}
                    else
                    {return 0;}
                case "a":
                default:
                    if (s1.calcBaseArea() > s2.calcBaseArea())
                    {return 1;}
                    else if (s1.calcBaseArea() < s2.calcBaseArea())
                    {return -1;}
                    else
                    {return 0;}
                    
                case "h":
                    if (s1.compareTo(s2) > 1)
                    {return 1;}
                    else if (s1.compareTo(s2) < 1)
                    {return -1;}
                    else 
                    {return 0;}       
            }   
            
        }
        
        
        public void ultimateCompare(String sortalgo){
            
            switch(sortalgo)
            {
                
                case"b":
                bubbleSort(data);
                break;
            
                case"i":
                insertionSort(data);
                break;
                
                case"s":
                selectionSort(data);
                break;
                
                case"m":
                mergeSort(data);
                break;
                
                case"q":
                quickSort(data);
                break;
            }
        
        
        }
        
        
        
        
    //Correct Implementation of the Bubble sort 
  
            public void bubbleSort(E[] data)
            {
                for (int j=0; j < size; j++)
                {
                    for (int y=1; y < size; y++)
                    {
                        if (compare(data[y], data[y-1]) > 0)
                        {
                           E x = data[y];
                           data[y] = data[y-1];
                           data[y-1] = x;
                        }
                    }
                    
                    //print out every 1000th value processed
                    if(comparetype == "a"){
                    if (j == 0 || j % 1000 == 0 || j == size - 1) {
                    System.out.println("Shape at index " + j + ": " + data[j].calcBaseArea());
                    }
                
                    }
                    else if (comparetype == "v"){
                    if (j == 0 || j % 1000 == 0 || j == size - 1) {
                    System.out.println("Shape at index " + j + ": " + data[j].calcVolume());
                    }
                
                    }
                    else {
                        if (j == 0 || j % 1000 == 0 || j == size - 1) {
                    System.out.println("Shape at index " + j + ": " + data[j].height);
                    }
                
                    }

                }
            }       


            public void insertionSort(E[] data)
            {
                for(int i=1; i<size; i++)
                {
                        int index = i;
                    for (int j = i-1; j>= 0; j--)
                    {
                        if (compare(data[index],data[j]) > 0)
                        {
                            E temp = data[index];
                            data[index] = data[j];
                            data[j] = temp;    
                        }
                        index = j;
                    }
                    //print out every 1000th value processed
                    if(comparetype == "a"){
                    if (i == 0 || i % 1000 == 0 || i == size - 1) {
                    System.out.println("Shape at index " + i + ": " + data[i].calcBaseArea());
                    }
                
                    }
                    else if (comparetype == "v"){
                    if (i == 0 || i % 1000 == 0 || i == size - 1) {
                    System.out.println("Shape at index " + i + ": " + data[i].calcVolume());
                    }
                
                    }
                    else {
                        if (i == 0 || i % 1000 == 0 || i == size - 1) {
                    System.out.println("Shape at index " + i + ": " + data[i].height);
                    }
                
                    }
                }
                
            }


        
            // this will take some time to figure out
            
            public void selectionSort(E[] data)
            {

                for (int i=0; i<size; i++)
                {
                    E min = data[i];
                   int minindex = i;
                    
                    for (int j = i+1; j<size; j++)
                    {    
                        if (compare(min, data[j]) < 0 )
                        {
                            min = data[j];
                            minindex = j;
                        }
                    }
            
                    swap(i, minindex);
                    if(comparetype == "a"){
                    if (i == 0 || i % 1000 == 0 || i == size - 1) {
                    System.out.println("Shape at index " + i + ": " + data[i].calcBaseArea());
                    }
                
                    }
                    else if (comparetype == "v"){
                    if (i == 0 || i % 1000 == 0 || i == size - 1) {
                    System.out.println("Shape at index " + i + ": " + data[i].calcVolume());
                    }
                
                    }
                    else {
                        if (i == 0 || i % 1000 == 0 || i == size - 1) {
                    System.out.println("Shape at index " + i + ": " + data[i].height);
                    }
                
                    }
                }
            } 
            
            
            private void swap(int i, int j)
                {
                    E temp = data [i];
                    data[i] = data[j];
                    data[j] = temp; 
                }
            


            
            public void mergeSort(E[] data)
            {
                int arrayLength = data.length;
                
                if (arrayLength < 2 )
                {
                    return;
                }
            
                int midindex = arrayLength / 2;
                
                E[] leftHalf =  (E[]) new Shape[midindex];
                E[] rightHalf = (E[]) new Shape[arrayLength-midindex];
                
                for (int i = 0; i < midindex; i++)
                {
                    leftHalf[i] = data[i];
                }
                
                for (int i = midindex; i < arrayLength; i++)
                {   
                    rightHalf[i - midindex] = data[i];
                }
                
                mergeSort(leftHalf);
                mergeSort(rightHalf);
               
                //merge
                merge(data,leftHalf,rightHalf);
                        
                
                
            }
            
            private void merge(E[] data,E[] leftHalf,E[] rightHalf)
            {
                int leftArrayLength = leftHalf.length;
                int rightArrayLength = rightHalf.length;
                
                //establish 3 int variables and set to zero. on the same line, wayyy to cool
                int i =0 ,j =0 ,k =0;
                
                
                while (i < leftArrayLength && j < rightArrayLength)
                {
                    
                    //implement Compare here
                    if (compare(leftHalf[i],rightHalf[j]) >= 0)
                    {
                        data[k] = leftHalf[i];
                        i++;
                    }
                    else
                    {
                        data[k] = rightHalf[j];
                        j++;
                        
                    }
                    //print every 1000th
                    //if (k == 0 || k % 1000 == 0 || k == data.length - 1) {
                   // System.out.println("Shape at index " + k + ": " + data[k]);
                  //  }
                k++;
                                      
                }
                while ( i < leftArrayLength) 
                {
                    data[k] = leftHalf[i];
                    //print every 1000th
                    //if (k == 0 || k % 1000 == 0 || k == data.length - 1) {
                    //System.out.println("Shape at index " + k + ": " + data[k]);
                    //    }
                    i++;
                    k++;
                }


                while(j < rightArrayLength)
                {
                    data[k] = rightHalf[j];
                    //print every 1000th
                    //if (k == 0 || k % 1000 == 0 || k == data.length - 1) {
                    //System.out.println("Shape at index " + k + ": " + data[k]);
                    //}
                    j++;
                    k++;
                }              
            
            }
            
            
            //Quick Sort
            
            
            public void quickSort(E[] array) {
            quickSortRecursive(array, 0, array.length - 1);
            }
            
            private void quickSortRecursive(E arr[], int begin, int end) 
            {
                
                
                
                if (begin < end) 
                {
                int partitionIndex = partition(arr, begin, end);

                quickSortRecursive(arr, begin, partitionIndex-1);
                quickSortRecursive(arr, partitionIndex+1, end);
                }
            }
            private int partition(E arr[], int begin, int end) 
            {
                E pivot = arr[end];
                int i = (begin-1);

                for (int j = begin; j < end; j++) {
                    if (compare(arr[j], pivot) >= 0) {
                        i++;

                        E swapTemp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swapTemp;
                    }
                }

                E swapTemp = arr[i+1];
                arr[i+1] = arr[end];
                arr[end] = swapTemp;

                return i+1;
            }


        
 //end of class
}

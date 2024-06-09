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
    public E [] data;
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
                }
            } 
            
            
            private void swap(int i, int j)
                {
                    E temp = data [i];
                    data[i] = data[j];
                    data[j] = temp; 
                }
            




        
 //end of class
}

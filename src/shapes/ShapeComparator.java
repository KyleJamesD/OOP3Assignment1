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
public class ShapeComparator implements Comparator<Shape>
{
    public int size;
    public Shape[] data;

    public int getSize() {
        return size;
    }

    public Shape[] getData() {
        return data;
    }
    
    
            
        @Override
        public int compare(Shape s1, Shape s2)
        {
            if (s1.calcBaseArea() > s2.calcBaseArea())
                {return 1;}
            
            else if (s1.calcBaseArea() < s2.calcBaseArea())
                {return -1;}
            
            else
                {return 0;}
        }
    
    //Correct Implementation of the Bubble sort 
  
    public void bubblesortArea(Shape[] data)
    {
        
        int size1 = data.length;
        for (int j=0; j < size1; j++)
        {
            for (int y=1; y < size1; y++)

            {
                if (compare(data[y], data[y-1]) > 0)
                {
                   Shape x = data[y];
                   data[y] = data[y-1];
                   data[y-1] = x;

                }

            }

        }

    }       

        
        
 //end of class
}

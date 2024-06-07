/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author kyled
 */
public class ShapeComparator  
{
    private int size;
    private Shape[] data;

    public int getSize() {
        return size;
    }

    public Shape[] getData() {
        return data;
    }

    public ShapeComparator(Shape[] data) {
        this.data = data;
        this.size = data.length;
    }
    
    
    //Correct Implementation of the Bubble sort 
    
    public void bubblesort()
    {

    for (int j=0; j <size; j++)
    {
        for (int y=1; y < size; y++)

        {
            if (data[y].compare(data[y-1], data[y]) > 0)
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

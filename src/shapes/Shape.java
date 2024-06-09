/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.util.Comparator;

/**
 *
 * @author kyled
 * @param <E>
 */
    public abstract class Shape implements Comparable<Shape>
    {
    
      Double height;
      public abstract Double calcVolume();
      public abstract Double calcBaseArea();

    public Double getHeight() {
        return height;
    }
    
    
    
        @Override
        public int compareTo(Shape s) 
        {
        return this.height.compareTo(s.height);
        }   
        
        
        /*
        public int compareArea(Shape s1, Shape s2)
        {
            int areaComparison = Double.compare(s1.calcBaseArea(), s2.calcBaseArea());
            return areaComparison;
        }
        
        
        public int compareVolume(Shape s1, Shape s2)
        {
            int areaComparison = Double.compare(s1.calcVolume(), s2.calcVolume());
            return areaComparison;
        }
        */


    
//end class  
}

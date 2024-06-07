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
public abstract class Shape implements Comparable<Shape>, Comparator<Shape>{
    
      Double height;
      public abstract double calcVolume();
      public abstract double calcBaseArea();
    
    
    
        @Override
        public int compareTo(Shape s) 
        {
        return this.height.compareTo(s.height);
        }   
        
        
        
        @Override
        public int compare(Shape s1, Shape s2)
        {
            if (s1.calcBaseArea()-s2.calcBaseArea() >= 1)
                {return 1;}
            
            else if (s1.calcBaseArea() < s2.calcBaseArea())
                {return -1;}
            
            else
                {return 0;}
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

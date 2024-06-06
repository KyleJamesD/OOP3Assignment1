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
public abstract class Shape<E extends Comparable> implements Comparator<E>{
    
      double height;
      public abstract void calcVolume();
      public abstract void calcBaseArea();
    
    
    
    
//end class  
}

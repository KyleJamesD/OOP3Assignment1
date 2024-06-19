/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

public abstract class Shape implements Comparable<Shape> {
    
    double height;
    public abstract double calcVolume();
    public abstract double calcBaseArea();

    public double getHeight() {
      return height;
    }

    @Override
    public int compareTo(Shape shape) {
        if (this.getHeight() > shape.getHeight()) return 1;
        else if (this.getHeight() < shape.getHeight()) return -1;
        else return 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() +"[height=" + height + ", volume=" + calcVolume() + ", area=" + calcBaseArea()+"]";
    }
}

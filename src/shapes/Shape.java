/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 * @param <>
 * @author kyled
 */
public abstract class Shape implements Comparable<Shape> {

    public double height;

    public abstract double calcVolume();

    public abstract double calcBaseArea();

    public double getHeight() {
        return height;
    }

    @Override
    public int compareTo(Shape o) {
        return Double.compare(this.height, o.height);
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() +"{" +
                "height=" + height +
                ", baseArea=" + calcBaseArea() +
                ", volume=" + calcVolume() +
                '}';
    }
}

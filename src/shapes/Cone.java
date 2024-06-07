package shapes;
import static java.lang.Math.PI;

public class Cone extends Shape
{

    //fields for cone class
    Double height;
    double radius;
    double area;
    double volume;

    
    //constructor takes two arguments to create object and automatically calculates volume and area.
    public Cone(Double height, double radius) {
        this.height = height;
        this.radius = radius;
        this.area = calcBaseArea();
        this.volume = calcVolume();
       
    }

    public Double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
    
    
   
    @Override
    public double calcBaseArea(){
        double area = PI * this.radius * this.radius;
        return area;  
    }
    
    @Override
    public double calcVolume(){ 
        double volume = (1.0/3.0) * PI * (this.radius*this.radius)*this.height;
        return volume;
    }
   
    //end class
}


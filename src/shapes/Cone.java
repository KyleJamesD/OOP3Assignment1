package shapes;
import static java.lang.Math.PI;

public class Cone extends Shape
{

    //fields for cone class
    double radius;

    
    //constructor takes two arguments to create object and automatically calculates volume and area.
    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
   
    @Override
    public double calcBaseArea()
    {
        double area = PI * this.radius * this.radius;
        return area;  
    }
    
    @Override
    public double calcVolume(){
        double volume1 = (1.0/3.0) * PI * (this.radius*this.radius)*this.height;
        return volume1;
    }
   
    //end class
}


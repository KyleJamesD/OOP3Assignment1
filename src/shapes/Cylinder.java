package shapes;
import static java.lang.Math.PI;
public class Cylinder extends Shape
{

    double radius;

    public Cylinder(Double height, Double radius) {
        this.height = height;
        this.radius = radius;
    }
    
    public double calcBaseArea(){
        return PI * this.radius * this.radius;
    }
    
    public double calcVolume(){
        return PI * this.radius * this.radius * this.height;
    }
    
    
    
    
//end class
}

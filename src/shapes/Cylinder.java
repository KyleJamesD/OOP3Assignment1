package shapes;
import static java.lang.Math.PI;
public class Cylinder
{
    
    double height;
    double radius;
    double area;
    double volume;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        this.area = calcBaseArea();
        this.volume = calcVolume();
    }
    
    
    
    private double calcBaseArea(){
        double area = PI * this.radius * this.radius;
        return area;
    }
    
    private double calcVolume(){
        double volume = PI * this.radius * this.radius * this.height;
        return volume;
    
    }
    
    
    
    
//end class
}
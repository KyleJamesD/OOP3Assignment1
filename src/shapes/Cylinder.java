package shapes;
import static java.lang.Math.PI;
public class Cylinder extends Shape
{

    double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double calcBaseArea(){
        return Math.round(PI * this.radius * this.radius) ;
    }
    
    public double calcVolume(){
        return Math.round(PI * this.radius * this.radius * this.height);
    
    }

}

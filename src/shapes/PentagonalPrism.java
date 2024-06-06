package shapes;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;
public class PentagonalPrism
{
    double height;
    double side;
    double area;
    double volume;

    public PentagonalPrism(double height, double side) {
        this.height = height;
        this.side = side;
        this.area = calcBaseArea();
        this.volume = calcVolume();
    }
    
    
    
    
    
    
    
    
    
    private double calcBaseArea(){
        double radians = toRadians(54);
        double area = (5 * (this.side * this.side) * tan(radians))  / 4;
        return area;
    }
    
    private double calcVolume(){
        double volume = this.area * this.height;
        return volume;
    }
    
    
    
//end class    
}

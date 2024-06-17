package shapes;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;
public class PentagonalPrism extends Shape
{
    Double side;
    Double area;
    Double volume;

    public PentagonalPrism(Double height, Double side) {
        this.height = height;
        this.side = side;
        this.area = calcBaseArea();
        this.volume = calcVolume();
    }

    public Double getHeight() {
        return height;
    }

    public Double getArea() {
        return area;
    }

    public Double getVolume() {
        return volume;
    }
    
    
    
    
    
    
    
    
    
    public Double calcBaseArea(){
        Double radians = toRadians(54);
        Double area1 = (5 * (this.side * this.side) * tan(radians))  / 4;
        return area1;
    }
    
    public Double calcVolume(){
        Double volume1 = calcBaseArea() * this.height;
        return volume1;
    }
    
    
    
//end class    
}

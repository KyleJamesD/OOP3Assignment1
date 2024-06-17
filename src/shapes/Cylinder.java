package shapes;
import static java.lang.Math.PI;
public class Cylinder extends Shape
{
    Double radius;
    Double area;
    Double volume;

    public Cylinder(Double height, Double radius) 
    {
        this.height = height;
        this.radius = radius;
        this.area = calcBaseArea();
        this.volume = calcVolume();
    }

    public Double getHeight() 
    {
        return height;
    }

    public Double getArea() 
    {
        return area;
    }

    public Double getVolume() 
    {
        return volume;
    }
    
    
    
    public Double calcBaseArea()
    {
        Double area1 = PI * this.radius * this.radius;
        return area1;
    }
    
    public Double calcVolume()
    {
        Double volume1 = PI * this.radius * this.radius * this.height;
        return volume1;
    
    }
    
    
    
    
//end class
}

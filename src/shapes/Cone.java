package shapes;
import static java.lang.Math.PI;

public class Cone extends Shape
{

    //fields for cone class
    
    Double radius;
    Double area;
    Double volume;

    
    //constructor takes two arguments to create object and automatically calculates volume and area.
    public Cone(Double height, Double radius) {
        this.height = height;
        this.radius = radius;
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
    
    
   
    @Override
    public Double calcBaseArea()
    {
        Double area1 = PI * this.radius * this.radius;
        return area1;  
    }
    
    @Override
    public Double calcVolume(){ 
        Double volume1 = (1.0/3.0) * PI * (this.radius*this.radius)*this.height;
        return volume1;
    }
   
    //end class
}


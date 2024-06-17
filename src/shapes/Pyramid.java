package shapes;
public class Pyramid extends Shape
{
    double side;
    double area;
    double volume;

    public Pyramid(Double height, double side) {
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
        
        Double area1 = side * side;
        return area1; 
    }
    
    public Double calcVolume(){
        
        Double volume1 = (1.0/3.0) * side * side * height;
        return volume1;
    }
    
 
//end class
}

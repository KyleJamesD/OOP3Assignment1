package shapes;
public class Pyramid
{
    Double height;
    double side;
    double area;
    double volume;

    public Pyramid(Double height, double edgelength) {
        this.height = height;
        this.side = edgelength;
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
    
   
    
    
    
    private double calcBaseArea(){
        
        double area = side * side;
        return area; 
    }
    
    private double calcVolume(){
        
        double volume = (1.0/3.0) * side * side * height;
        return volume;
    }
    
 
//end class
}

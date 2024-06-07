package shapes;
public class OctagonalPrism
{
    Double height;
    double side;
    double area;
    double volume;

    public OctagonalPrism(Double height, double side) {
        this.height = height;
        this.side = side;
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
        double area = 2 * (1 + Math.sqrt(2)) * this.side * this.side;
        return area;
    }
    
    private double calcVolume(){
        double volume = this.area * this.height;
        return volume;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  //end class  
}

package shapes;
public class OctagonalPrism
{
    double height;
    double side;
    double area;
    double volume;

    public OctagonalPrism(double height, double side) {
        this.height = height;
        this.side = side;
        this.area = calcBaseArea();
        this.volume = calcVolume();
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

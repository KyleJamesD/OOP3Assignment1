package shapes;

public class TriangularPrism
{
    double height;
    double side;
    double area;
    double volume;

    
    
    public TriangularPrism(double height, double side) {
        this.height = height;
        this.side = side;
        this.area = calcBaseArea();
        this.volume = calcVolume();
    }
    
    
    
    
    
    private double calcBaseArea(){
        double area = (side * side * (Math.sqrt(3)))/4.0;
        return area;
    }
    
    private double calcVolume(){
        double volume = this.area * height;
        return volume;
    
    }
    
//end class
}

package shapes;

public class TriangularPrism
{
    Double height;
    double side;
    double area;
    double volume;

    
    
    public TriangularPrism(Double height, double side) {
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
        double area = (side * side * (Math.sqrt(3)))/4.0;
        return area;
    }
    
    private double calcVolume(){
        double volume = this.area * height;
        return volume;
    
    }
    
//end class
}

package shapes;

public class SquarePrism
{
    Double height;
    double side;
    double area;
    double volume;

    
    //constructor
    public SquarePrism(Double height, double side) {
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
        double area = side * side;
        return area;
    
    }
    
    private double calcVolume(){
    
        double volume = side * side * height;
        return volume;
    
    }
    
//end class
}

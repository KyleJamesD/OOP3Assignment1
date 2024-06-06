package shapes;

public class SquarePrism
{
    double height;
    double side;
    double area;
    double volume;

    
    //constructor
    public SquarePrism(double height, double side) {
        this.height = height;
        this.side = side;
        this.area = calcBaseArea();
        this.volume = calcVolume();
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

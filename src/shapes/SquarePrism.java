package shapes;

public class SquarePrism extends Shape
{
    Double side;
    Double area;
    Double volume;

    
    //constructor
    public SquarePrism(Double height, Double side) {
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
    
        Double volume1 = side * side * height;
        return volume1;
    
    }
    
//end class
}

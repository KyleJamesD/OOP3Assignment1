package shapes;

public class TriangularPrism extends Shape
{
    Double side;
    Double area;
    Double volume;

    
    
    public TriangularPrism(Double height, Double side) {
        this.height = height;
        this.side = side;
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
        double area1 = (side * side * (Math.sqrt(3)))/4.0;
        return area1;
    }
    
    public Double calcVolume(){
        double volume1 = calcBaseArea() * height;
        return volume1;
    
    }
    
//end class
}

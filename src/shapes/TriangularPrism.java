package shapes;

public class TriangularPrism extends Prism
{
    public TriangularPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double calcBaseArea(){
        return (side * side * (Math.sqrt(3)))/4.0;
    }
    
    public double calcVolume(){
        return this.calcBaseArea() * height;
    }

}

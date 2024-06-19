package shapes;

public class TriangularPrism extends Prism
{
    public TriangularPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double calcBaseArea(){
        return (this.side * this.side * (Math.sqrt(3)))/4.0;
    }
    
    public double calcVolume(){
        return this.calcBaseArea() * this.height;
    }
    
//end class
}

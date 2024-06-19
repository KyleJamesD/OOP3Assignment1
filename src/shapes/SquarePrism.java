package shapes;

public class SquarePrism extends Prism
{
    //constructor
    public SquarePrism(double height, double side) {
        this.height = height;
        this.side = side;
    }
    
    public double calcBaseArea(){
        return this.side * this.side;
    }
    
    public double calcVolume(){
        return this.calcBaseArea() * this.height;
    }
    
//end class
}

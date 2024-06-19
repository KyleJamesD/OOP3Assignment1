package shapes;

import static java.lang.Math.tan;
import static java.lang.Math.toRadians;

public class PentagonalPrism extends Prism
{
    public PentagonalPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double calcBaseArea(){
        double radians = toRadians(54);
        return (5 * (this.side * this.side) * tan(radians))  / 4;
    }
    
    public double calcVolume(){
        return this.calcBaseArea() * this.height;
    }

//end class    
}

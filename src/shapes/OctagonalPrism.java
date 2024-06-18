package shapes;


public class OctagonalPrism extends Prism {

    public OctagonalPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double calcBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * this.side * this.side;
    }

    public double calcVolume() {
        return this.calcBaseArea() * this.height;
    }
}

package shapes;


public class OctagonalPrism extends Prism {

    public OctagonalPrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double calcBaseArea() {
        return Math.round(2 * (1 + Math.sqrt(2)) * this.side * this.side);
    }

    public double calcVolume() {
        return Math.round(this.calcBaseArea() * this.height);
    }
}

package shapes;

public class SquarePrism extends Prism {

    public SquarePrism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double calcBaseArea() {
        return Math.round(side * side);

    }

    public double calcVolume() {

        return Math.round(side * side * height) ;
    }
}

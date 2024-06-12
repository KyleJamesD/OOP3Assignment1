package shapes;

public class Pyramid extends Shape {
    double side;


    public Pyramid(double height, double side) {
        this.height = height;
        this.side = side;
    }


    public double calcBaseArea() {
        return side * side;
    }

    public double calcVolume() {
        return (1.0 / 3.0) * side * side * height;
    }


//end class
}

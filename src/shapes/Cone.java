package shapes;

import static java.lang.Math.PI;

public class Cone extends Shape {

    double radius;

    //constructor takes two arguments to create object and automatically calculates volume and area.
    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calcBaseArea() {
        return Math.round(PI * this.radius * this.radius) ;

    }

    @Override
    public double calcVolume() {
        return Math.round((1.0 / 3.0) * this.calcBaseArea() * this.height);
    }

}


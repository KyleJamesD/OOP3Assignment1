package shapes;

import java.util.Comparator;

public class BaseAreaCompare implements Comparator<Shape> {
    @Override

    public int compare(Shape o1, Shape o2) {
        //from the largest to smallest (descending order)
        return Double.compare(o2.calcBaseArea(), o1.calcBaseArea());
    }
}

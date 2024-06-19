package shapes;

import java.util.Comparator;

public class HeightCompare implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        return Double.compare(o2.getHeight(), o1.getHeight());
    }
}

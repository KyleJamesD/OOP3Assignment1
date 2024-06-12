package utilities.comparotor;

import shapes.Shape;

import java.util.Comparator;

public class HeightComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        // descending order: o2 - o1
        return Double.compare(o2.getHeight(), o1.getHeight());
    }
}

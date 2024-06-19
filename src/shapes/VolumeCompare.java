package shapes;

import java.util.Comparator;

public class VolumeCompare implements Comparator<Shape> {

    @Override
    public int compare(Shape o1, Shape o2) {
        //System.out.println(o1);
        //from the largest to smallest (descending order)
        return Double.compare(o2.calcVolume(), o1.calcVolume());
    }
}

package utilities.algorithm;

import shapes.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class MySort extends SortAlgorithm<Shape> {

    public MySort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }
    @Override
    public void sort(Shape[] data) {
        // todo: implement my sort
        Arrays.sort(data, comparator);
    }
}

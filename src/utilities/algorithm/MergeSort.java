package utilities.algorithm;

import shapes.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort extends SortAlgorithm<Shape> {
    public MergeSort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }

    @Override
    public  void sort(Shape[] data) {
        // todo: implement merge sort
        Arrays.sort(data, comparator);
    }
}

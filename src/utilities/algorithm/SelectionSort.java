package utilities.algorithm;

import shapes.Shape;

import java.util.Comparator;

public class SelectionSort extends SortAlgorithm<Shape> {
    public SelectionSort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }
    @Override
    public void sort(Shape[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (this.comparator.compare(data[j],data[maxIndex]) < 0) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                swap(data, i, maxIndex);
            }
        }
    }
}

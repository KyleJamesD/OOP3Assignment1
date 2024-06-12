package utilities.algorithm;

import shapes.Shape;

import java.util.Comparator;

public class InsertionSort extends SortAlgorithm<Shape> {

    public InsertionSort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }
    @Override
    public  void sort(Shape[] data) {
        for (int i = 1; i < data.length; i++) {
            Shape current = data[i];
            int j = i - 1;
            while (j >= 0 && comparator.compare(data[j],current)> 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = current;
        }
    }
}

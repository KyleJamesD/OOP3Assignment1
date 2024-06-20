package utilities.algorithm;

import shapes.Shape;

import java.util.Comparator;

public class BubbleSort extends SortAlgorithm<Shape> {
    public BubbleSort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(Shape[] data) {
        if (data == null || data.length == 0) {
            return;
        }
        for (int i = data.length - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (this.comparator.compare(data[j], data[j + 1]) > 0) {
                    swap(data, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

package utilities.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort extends SortAlgorithm {
    @Override
    public <T> void sort(T[] data, Comparator<? super T> comparator) {
        if (data == null || data.length == 0) {
            return;
        }
        for (int i = data.length - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (comparator.compare(data[j], data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

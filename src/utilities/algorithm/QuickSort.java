package utilities.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class QuickSort extends SortAlgorithm {
    @Override
    public <T> void sort(T[] data, Comparator<? super T> comparator) {
        // todo: implement quick sort

        Arrays.sort(data, comparator);
    }
}

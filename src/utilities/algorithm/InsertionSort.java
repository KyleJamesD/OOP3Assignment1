package utilities.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class InsertionSort extends SortAlgorithm {
    @Override
    public <T> void sort(T[] data, Comparator<? super T> comparator) {
        // todo: implement insertion sort

        Arrays.sort(data, comparator);
    }
}

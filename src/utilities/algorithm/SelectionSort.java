package utilities.algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSort extends SortAlgorithm {
    @Override
    public <T> void sort(T[] data, Comparator<? super T> comparator) {
        // todo: implement selection sort

        Arrays.sort(data, comparator);
    }
}

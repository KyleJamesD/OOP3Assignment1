package utilities.algorithm;

import java.util.Comparator;

public abstract class SortAlgorithm {
    public abstract <T> void sort(T[] data, Comparator<? super T> comparator);
}

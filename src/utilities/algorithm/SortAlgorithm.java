package utilities.algorithm;

import java.util.Comparator;

public abstract class SortAlgorithm<T> {
    public Comparator<T> comparator;
    public abstract void sort(T[] data);
}

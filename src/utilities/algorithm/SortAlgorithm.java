package utilities.algorithm;

import java.util.Comparator;

public abstract class SortAlgorithm<T> {
    public Comparator<T> comparator;
    public abstract void sort(T[] data);
    public void swap(T[] data, int i, int j) {
        T temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}

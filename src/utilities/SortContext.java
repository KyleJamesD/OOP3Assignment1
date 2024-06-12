package utilities;

import shapes.Shape;
import utilities.algorithm.SortAlgorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;

public class SortContext<T> {

    private T[] data;
    private Comparator<T> comparator;

    private SortAlgorithm sortAlgorithm;

    public SortContext(Comparator<T> comparator, SortAlgorithm sortAlgorithm, T[] data) {

        this.comparator = comparator;
        this.sortAlgorithm = sortAlgorithm;
        this.data = data;
    }


    public void sort() {
        sortAlgorithm.sort(data, comparator);
    }


}

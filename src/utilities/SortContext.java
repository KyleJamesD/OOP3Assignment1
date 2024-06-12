package utilities;

import shapes.Shape;
import utilities.algorithm.SortAlgorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Comparator;

public class SortContext<T> {

    private T[] data;

    private SortAlgorithm<T> sortAlgorithm;

    public SortContext(SortAlgorithm<T> sortAlgorithm, T[] data) {

        this.sortAlgorithm = sortAlgorithm;
        this.data = data;
    }


    public void sort() {
        sortAlgorithm.sort(data);
    }


}

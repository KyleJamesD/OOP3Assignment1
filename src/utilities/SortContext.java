package utilities;

import utilities.algorithm.SortAlgorithm;

public class SortContext<T> {

    private final T[] data;

    private final SortAlgorithm<T> sortAlgorithm;

    public SortContext(SortAlgorithm<T> sortAlgorithm, T[] data) {

        this.sortAlgorithm = sortAlgorithm;
        this.data = data;
    }


    public void sort() {
        sortAlgorithm.sort(data);
    }


}

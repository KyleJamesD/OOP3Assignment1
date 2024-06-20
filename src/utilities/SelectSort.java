package utilities;

import java.util.Comparator;

public class SelectSort<T> extends SortUtils<T> {

    public void sort(T[] array, Comparator<T> comparator) {

        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], array[min_index]) < 0){
                    min_index = j;
                }
            }
            SortUtils.swap(array, i, min_index);
        }
    }
}

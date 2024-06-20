package utilities;

import java.util.Comparator;

public class InsertionSort<T> extends SortUtils<T> {

    public void sort(T[] array, Comparator<T> comparator) {
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;
            while ( j >= 0 && comparator.compare(array[j],key) > 0 ){
                SortUtils.swap(array, j, j+1);
                j--;
            }
        }
    }
}

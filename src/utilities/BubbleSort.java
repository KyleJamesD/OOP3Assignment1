package utilities;

import java.util.Comparator;

public class BubbleSort <T> extends SortUtils<T>{

    public void sort(T[] array, Comparator<T> comparator){
        for (int i = array.length - 1; i > 0; i--) {
            boolean IsSwap = false;
            for (int j = 0; j < i; j++) {
                if ( j < array.length - 1 && comparator.compare(array[j], array[j + 1]) > 0) {
                    SortUtils.swap(array, j, j + 1);
                    IsSwap = true;
                }
            }
            if (!IsSwap) break;
        }
    }
}

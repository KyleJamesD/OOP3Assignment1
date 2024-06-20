package utilities;

import java.util.Comparator;

public class HeapSort<T> extends SortUtils<T> {

    public void sort(T[] array, Comparator<T> comparator) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i, comparator);
        }
        for (int i = n - 1; i >= 0; i--) {
            SortUtils.swap(array, 0, i);
            heapify(array, i, 0, comparator);
        }

    }

    private void heapify(T[] array, int arraySize, int index, Comparator<T> comparator){

        int largest = index;
        int leftpointer = index*2+1;
        int rightpointer = index*2+2;

        if(leftpointer < arraySize && comparator.compare(array[leftpointer], array[largest]) > 0){
            largest = leftpointer;
        }
        if(rightpointer < arraySize && comparator.compare(array[rightpointer], array[largest]) > 0){
            largest = rightpointer;
        }
        if(largest != index){
            SortUtils.swap(array, largest, index);
            heapify(array, arraySize, largest, comparator);
        }
    }
}

package utilities.algorithm;

import shapes.Shape;

import java.util.Comparator;

public class MySort extends SortAlgorithm<Shape> {

    public MySort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }
    public void sort(Shape[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            swap(array, 0, i);
            heapify(array, i, 0);
        }

    }

    private void heapify(Shape[] array, int arraySize, int index){

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
            swap(array, largest, index);
            heapify(array, arraySize, largest);
        }
    }
}

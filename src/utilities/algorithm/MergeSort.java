package utilities.algorithm;

import shapes.Shape;

import java.util.Comparator;

public class MergeSort extends SortAlgorithm<Shape> {
    public MergeSort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }

    @Override
    public  void sort(Shape[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    private void mergeSort(Shape[] data, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(data, left, mid);
        mergeSort(data, mid + 1, right);
        merge(data, left, mid, right);
    }

    private void merge(Shape[] data, int left, int mid, int right) {
        // temp merge array to store the sorted elements
        Shape[] temp = new Shape[right - left + 1];
        // start index of the left subarray
        int i = left;
        // start index of the right subarray
        int j = mid + 1;
        // start index of the temp array
        int k = 0;
        while (i <= mid && j <= right) {
            if (this.comparator.compare(data[i], data[j]) <= 0) {
                temp[k] = data[i];
                k++;
                i++;
            } else {
                temp[k] = data[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k] = data[i];
            k++;
            i++;
        }
        while (j <= right) {
            temp[k] = data[j];
            k++;
            j++;
        }
        for (k = 0; k < temp.length; k++) {
            data[left + k] = temp[k];
        }
    }
}

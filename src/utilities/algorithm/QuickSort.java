package utilities.algorithm;

import shapes.Shape;

import java.util.Comparator;

public class QuickSort extends SortAlgorithm<Shape> {
    public QuickSort(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void sort(Shape[] data) {
        // todo: implement quick sort


    }

    private void quickSort(Shape[] data, int left, int right) {
        // when left == right, there is only one element, no need to sort
        if (left >= right) {
            return;
        }

        int pivot = partition(data, left, right);
        quickSort(data, left, pivot - 1);
        quickSort(data, pivot + 1, right);

    }


    private int partition(Shape[] data, int left, int right) {
        int median = medianOfThree(data, left, right);
        swap(data, median, left);
        int pivot = left;
        while (left < right) {
            while (left < right && this.comparator.compare(data[right], data[pivot]) >= 0) {
                right--;
            }
            while (left < right && this.comparator.compare(data[left], data[pivot]) <= 0) {
                left++;
            }
            swap(data, left, right);
        }
        swap(data, pivot, left);
        return left;
    }

    private void swap(Shape[] nums, int i, int j) {
        Shape temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int medianOfThree(Shape[] data, int left, int right) {
        int mid = (left + right) / 2;
        Shape l = data[left];
        Shape m = data[mid];
        Shape r = data[right];
        if ((this.comparator.compare(l, m) >= 0 && this.comparator.compare(l, r) <= 0) ||
                (this.comparator.compare(l, m) <= 0 && this.comparator.compare(l, r) >= 0)) {
            return left;
        } else if ((this.comparator.compare(m, l) >= 0 && this.comparator.compare(m, r) <= 0) ||
                (this.comparator.compare(m, l) <= 0 && this.comparator.compare(m, r) >= 0)) {
            return mid;
        } else {
            return right;
        }

    }
}

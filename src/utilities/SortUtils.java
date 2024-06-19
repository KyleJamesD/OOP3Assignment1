package utilities;

public class SortUtils {

    public static <T> void swap(T[] array, Integer index1, Integer index2){
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <T> void printSort(T[] array){
        System.out.println("First index: " + array[0].toString());
        System.out.println("Last index: " + array[array.length-1].toString());
    }
}

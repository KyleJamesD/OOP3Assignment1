package utilities.factory;

import shapes.Shape;
import utilities.algorithm.*;
import utilities.comparotor.BaseAreaComparator;
import utilities.comparotor.HeightComparator;
import utilities.comparotor.VolumeComparator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.StringTokenizer;

public class UtilityFactory {

    private static final String BUBBLE_SORT = "b";
    private static final String SELECTION_SORT = "s";
    private static final String INSERTION_SORT = "i";
    private static final String MERGE_SORT = "m";
    private static final String QUICK_SORT = "q";
    private static final String MY_SORT = "z";
    private static final String COMPARE_HEIGHT = "h";
    private static final String COMPARE_VOLUME = "v";
    private static final String COMPARE_AREA = "a";


    public static Comparator<Shape> getComparator(String parameter) {
        return switch (parameter) {
            case COMPARE_HEIGHT -> new HeightComparator();
            case COMPARE_VOLUME -> new BaseAreaComparator();
            case COMPARE_AREA -> new VolumeComparator();
            default -> throw new IllegalArgumentException("Invalid comparator parameter: " + parameter);
        };
    }

    public static SortAlgorithm getSortAlgorithm(String parameter) {
        return switch (parameter) {
            case BUBBLE_SORT -> new BubbleSort();
            case SELECTION_SORT -> new SelectionSort();
            case INSERTION_SORT -> new InsertionSort();
            case MERGE_SORT -> new MergeSort();
            case QUICK_SORT -> new QuickSort();
            case MY_SORT -> new MySort();
            default -> throw new IllegalArgumentException("Invalid sort parameter: " + parameter);
        };
    }

    public static Shape[] getData(String param) {

        try (BufferedReader br = new BufferedReader(new FileReader(param))) {
            String line = br.readLine();
            if (line == null) {
                throw new IllegalArgumentException("File is empty: " + param);
            }
            int size = Integer.parseInt(line);
            System.out.println("File Size: " + size );
            Shape[] data = new Shape[size];

            line = br.readLine();
            int i = 0;
            while (line != null) {
                data[i] = reflectShape(line);
                i++;
                line = br.readLine();
            }
            return data;
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return null;
        }
    }

    private static Shape reflectShape(String line) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        StringTokenizer st = new StringTokenizer(line);
        Class<?> aClass = Class.forName("shapes." + st.nextToken());
        Constructor<?> constructor = aClass.getConstructor(double.class, double.class);
        return (Shape) constructor.newInstance(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
    }
}

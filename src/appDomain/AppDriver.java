package appDomain;
import shapes.*;
import utilities.BubbleSort;
import utilities.InsertionSort;
import utilities.SelectSort;
import utilities.SortUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AppDriver
{

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests
        String[] params = parseArgs( args );
        if ( params.length == 3 ){
            Shape[] shapes = readFile(params[0]);
            assert shapes != null;
            //System.out.println("Before sorting: " + Arrays.toString( shapes ));
            //SortUtils.printSort(shapes);
            sortArray(shapes, params[2], getComparator(params[1]));
            System.out.println("After sorting: " + Arrays.toString( shapes ));
            SortUtils.printSort(shapes);
        }

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

		// refer to demo03 OfficeManager.java on how to create specific
		// objects using reflection from a String

	}
    private static String[] parseArgs(String[] args){

        String[] params = new String[3];

        if ( args.length != 3 ){
            //-f or -F followed by file_name (the file name and path) with no spaces
            //-t or -T followed by v (volume), h (height) or a (base area) with no spaces
            //-s or -S followed by b (bubble), s (selection), i (insertion), m (merge), q (quick) or z
            //(your choice of sorting algorithm) with no spaces
            System.out.println( "Usage: java -jar Sort.jar -f<file_name> -t<v/h/a> -s<b/s/i/m/q/z>");
            System.exit( 1 );
        }
        //System.out.println( "Testing args..." );
        for( int i = 0; i < args.length; i++ )
        {
            //System.out.println( args[i] );
            if ( args[i].length() < 2 ) {
                System.out.println( "Invalid Parameter: " + args[i] );
                return null;
            }
            if ( args[i].startsWith("-f") || args[i].startsWith("-F") ){
                params[0] = args[i].substring( 2 );
                if ( !params[0].endsWith( ".txt" ) && !params[0].endsWith( ".txt\"" ) ){
                    System.out.println( "Invalid Filename Format: " + params[0] );
                    return null;
                }
                if ( params[0].startsWith("\"")){
                    params[0] = params[0].substring(1).replace("\"", "");;
                }
                System.out.println( "Filename: " + params[0]);
            }
            else if ( args[i].startsWith("-t") || args[i].startsWith("-T") ){
                params[1] = args[i].substring(2);
                if ( !params[1].equalsIgnoreCase("v") && !params[1].equalsIgnoreCase("h") && !params[1].equalsIgnoreCase("a") ){
                    System.out.println( "Invalid Type: " + params[1] );
                    return null;
                }
                System.out.println( "Type: " + params[1]);
            }
            else if ( args[i].startsWith("-s") || args[i].startsWith("-S") ){
                params[2] = args[i].substring(2);
                if ( !params[2].equalsIgnoreCase("b") && !params[2].equalsIgnoreCase("s") && !params[2].equalsIgnoreCase("i")
                        && !params[2].equalsIgnoreCase("m") && !params[2].equalsIgnoreCase("q") && !params[2].equalsIgnoreCase("z") ){
                    System.out.println( "Invalid Sort: " + params[2] );
                    return null;
                }
                System.out.println( "Sort: " + params[2]);
            }
            else{
                System.out.println( "Invalid Parameter: " + args[i] );
                return null;
            }
        }
        if (params[0] == null || params[1] == null || params[2] == null) return null;
        return params;
    }

    private static Shape[] readFile(String filename){
        File file = new File( filename );
        Scanner input = null;

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        if ( input.hasNext()){
            int count = Integer.parseInt(input.nextLine());
            System.out.println( "Data count : " + count );
            Shape[] shapes = new Shape[count];

            for ( int i = 0; i < count; i++ ){
                if (input.hasNext()){
                    String line = input.nextLine();
                    String[] parts = line.split(" ");
                    String shapeName = parts[0];
                    double height = Double.parseDouble(parts[1]);
                    double value = Double.parseDouble(parts[2]);

                    switch ( shapeName ){
                        case "Cone":
                            shapes[i] = new Cone( height, value );
                            break;
                        case "Cylinder":
                            shapes[i] = new Cylinder( height, value );
                            break;
                        case "Pyramid":
                            shapes[i] = new Pyramid( height, value );
                            break;
                        case "SquarePrism":
                            shapes[i] = new SquarePrism( height, value );
                            break;
                        case "TriangularPrism":
                            shapes[i] = new TriangularPrism( height, value );
                            break;
                        case "PentagonalPrism":
                            shapes[i] = new PentagonalPrism( height, value );
                            break;
                        case "OctagonalPrism":
                            shapes[i] = new OctagonalPrism( height, value );
                            break;
                        default:
                            System.out.println( "Invalid Shape: " + shapeName );
                            break;
                    }
                }
            }
            return shapes;
        }
        else return null;
    }

    private static Comparator<Shape> getComparator(String type){
        //-t<v/h/a>
        switch( type ){
            case "v":
                return new VolumeCompare();
            case "a":
                return new BaseAreaCompare();
            case "h":
            default:
                return new HeightCompare();
        }
    }

    private static void sortArray(Shape[] shapes, String sort_method, Comparator<Shape> comparator){
        //-s<b/s/i/m/q/z>
        switch ( sort_method.toLowerCase() ){
            case "b":
                BubbleSort<Shape> bubble = new BubbleSort<>();
                bubble.bubbleSort(shapes, comparator);
            case "s":
                SelectSort<Shape> select = new SelectSort<>();
                select.selectSort(shapes, comparator);
            case "i":
            default:
                InsertionSort<Shape> insert = new InsertionSort<>();
                insert.insertionSort(shapes, comparator);
        }
    }

//end of class
}

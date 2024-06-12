package appDomain;

import shapes.Shape;
import utilities.SortContext;
import utilities.algorithm.SortAlgorithm;
import utilities.factory.UtilityFactory;

import java.util.Arrays;
import java.util.Comparator;

public class AppDriver
{
	public static final String PREFIX_COMPARE = "-t";
	public static final String PREFIX_SORT = "-s";
	public static final String PREFIX_FILE = "-f";

	public static void main( String[] args )
	{
		// The parameters are read from the command line
		String[] params =  parseArgs(args); // [comparator, sort, fileName]

		// The factory  generates comparators, sorting algorithms and data
		Comparator<Shape> shapeComparator = UtilityFactory.getComparator(params[0]);
		SortAlgorithm sortAlgorithm = UtilityFactory.getSortAlgorithm(params[1]);
		Shape[] data = UtilityFactory.getData(params[2]);

		// The context class is used to sort the data
		SortContext<Shape> sortContext = new SortContext<Shape>(shapeComparator, sortAlgorithm, data);
		sortContext.sort();

		// test the sorting algorithm
		printSortedData(data);

	}

	private static String[] parseArgs(String[] args) {
		if (args.length != 3) {
			throw new IllegalArgumentException("Invalid number of arguments: " + args.length);
		}
		String[] parsedArgs = new String[3];
		for (String arg : args) {
			if (arg.length() <= 2) {
				throw new IllegalArgumentException("Invalid argument: " + arg);
			}
			// prefix: -t for comparator, -s for sort, -f for file
			String prefix = arg.substring(0, 2);
			if (prefix.equalsIgnoreCase(PREFIX_COMPARE)) {
				parsedArgs[0] = arg.substring(prefix.length());
			}
			if (prefix.equalsIgnoreCase(PREFIX_SORT)) {
				parsedArgs[1] = arg.substring(prefix.length());
			}
			if (prefix.equalsIgnoreCase(PREFIX_FILE)){
				parsedArgs[2] = arg.substring(prefix.length());
			}
		}
		if (parsedArgs[0] == null || parsedArgs[1] == null || parsedArgs[2] == null) {
			throw new IllegalArgumentException("Invalid arguments: " + Arrays.toString(args));		}
		return parsedArgs;
	}

	private static void printSortedData(Shape[] data) {
		if (data == null || data.length == 0) {
			System.out.println("No data to print");
			return;
		}
		int index = 0;
		while (true) {
			System.out.println(index + ":" + data[index].toString());
			index += 1000;
			if (index >= data.length -1 ) {
				System.out.println(data.length -1 + ":" + data[data.length - 1].toString());
				break;
			}
		}
	}

}

package appDomain;
import java.util.Arrays;
import java.util.Collections;
import shapes.Shape;
import shapes.ShapeComparator;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Prism;
import shapes.Pyramid;
import shapes.ShapeComparator;
import shapes.SquarePrism;
import shapes.TriangularPrism;

public class AppDriver
{

	public static void main( String[] args )
	{
		// TODO Auto-generated method stub

		// refer to demo001 BasicFileIO.java for a simple example on how to
		// read data from a text file

		// refer to demo01 Test.java for an example on how to parse command
		// line arguments and benchmarking tests

		// refer to demo02 Student.java for comparable implementation, and
		// NameCompare.java or GradeCompare for comparator implementations

		// refer to demo02 KittySort.java on how to use a custom sorting
		// algorithm on a list of comparables to sort using either the
		// natural order (comparable) or other orders (comparators)

		// refer to demo03 OfficeManager.java on how to create specific
		// objects using reflection from a String
            
            
            
            
            //BIGG NUMBERS!!
            
            /*
            Shape[] array1 = new Shape[8];
            array1[0] = new OctagonalPrism(25253.611,29464.463);
            array1[1] = new Pyramid (34976.672, 8556.669);
            array1[2] = new TriangularPrism (12209.184, 38774.693);
            array1[3] = new Cylinder (1521.368, 20605.12);
            array1[4] = new Pyramid (31006.316, 9388.066);
            array1[5] = new Pyramid (34569.78, 805.624);
            array1[6] = new Cone (29639.636, 29106.678);
            array1[7] = new PentagonalPrism (3122.807, 9856.483);
            */
            
            
            
            Shape[] array1 = new Shape[8];
            array1[0] = new OctagonalPrism(2.5253611,2.9464463);
            array1[1] = new Pyramid (3.4976672, 8.556669);
            array1[2] = new TriangularPrism (1.2209184, 3.8774693);
            array1[3] = new Cylinder (1.521368, 2.060512);
            array1[4] = new Pyramid (3.1006316, 9.388066);
            array1[5] = new Pyramid (3.456978, 8.05624);
            array1[6] = new Cone (2.9639636, 2.9106678);
            array1[7] = new PentagonalPrism (3.122807, 9.856483);
            
            
            for (int i=0; i < 8 ; i++)
            {
                System.out.println(array1[i].calcBaseArea());
            }
            
            
            
            //compare type
            String area = "a";
            String volume = "v";
            String height = "h";
            //sort algo 
            String bubble = "b";
            String insertion = "i";
            String selection = "s";
            String quick = "q";
                   
            
            
            
            
            // add constructor to shape comparator and call bubble sort function on new object firstcompare.
            ShapeComparator firstcompare = new ShapeComparator(array1,area,insertion);
            
            
            //this is for testing 
            //firstcompare.bubblesort(array1);
            //this is for testing 
            //firstcompare.insertionSort(array1);
            
           //this is for testing
           firstcompare.selectionSort(array1);
            
            System.out.println();
            System.out.println();
            System.out.println();
                
                
            for (int j=0; j < 8 ; j++)
            {
                System.out.println(array1[j].calcBaseArea());
            }
                
                
                
          //end of main      
	}
//end of class
}

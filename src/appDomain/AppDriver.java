package appDomain;
import java.util.Arrays;
import java.util.Collections;
import shapes.Shape;
import shapes.ShapeComparator;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.ShapeComparator;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



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
            
            //  **************begin command line code ***************************** 
            
            String filepath = "C:\\Users\\kyled\\Desktop\\Github\\Java Projects\\OOP3Assignment1\\res\\shapes2.txt";
            String comparetype = "h";
            String sortalgo = "q";
            
            
            
            
            
            
            
           /*
            for(int i = 0; i < args.length; i++){
            switch(args[i].toLowerCase()){
            
                case "-f":
                 filepath = args[i].substring(2);
                 break;
                 
                 case "-t":
                 comparetype = args[i].substring(2);
                 break;
                 
                 case "-s":
                 sortalgo = args[i].substring(2);
                 break;
                }
            }
           */
           
           /*
           for (String arg : args ){
           switch (arg.substring(0,2).toLowerCase()){
                case "-f":
                 filepath = args[0].substring(2);
                 break;
                 
                 case "-t":
                 comparetype = args[0].substring(2);
                 break;
                 
                 case "-s":
                 sortalgo = args[0].substring(2);
                 break;
                }
            }
             
           */
            
            
           
           /*
           for (int i = 0; i < args.length; i++) 
           {
            if (args[i].startsWith("-f")) 
            {
                filepath = args[i].substring(2);
            } 
            else if (args[i].startsWith("-t")) 
            {
                comparetype = args[i].substring(2).toLowerCase();
            } 
            else if (args[i].startsWith("-s")) 
            {
                sortalgo = args[i].substring(2).toLowerCase();
            }
            
           }
           */
           
           
           
           /*
           if (filepath == null){
           System.out.println("File path must be inputed with -f option.");
           return;
           
           } 
           if (comparetype == null){
           System.out.println("compare type must be inputed with -t option.");
           return;
           
           } 
           if (sortalgo == null){
           System.out.println("Sort method must be inputed with -s followed by one of the characters \' b,i,s,m,q \'.");
           return;
           
           } 
*/
            
            System.out.println("File Path:"+ filepath);
            System.out.println("Compare Type:"+ comparetype);
            System.out.println("Sort Method:"+ sortalgo);
            
            //call parseFile to parse given file and create an array of specific Shape objects
            Shape shapes[] = parseFile(filepath);
            //create new Shape comparator object 
            
            ShapeComparator firstcompare = new ShapeComparator(shapes,comparetype,sortalgo);
            
            //start of time 
            long start = System.currentTimeMillis();
            // run sorting algo
            firstcompare.ultimateCompare(sortalgo);
            long stop = System.currentTimeMillis();
            
            long time1 = stop - start;
            System.out.println("Time taken: " + time1 + " milliseconds");
            
            
                
                
          //end of main      
    }
        
        
        
        
        //parse file path into an array of type shape.
            public static Shape [] parseFile(String filepath){
            Shape[] shapes ;
            //trys to read file ifnot diplayes file is empty
            try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line = br.readLine();
            if (line == null) {
            System.out.println("Empty file.");
            return null;
            }
            
            int numShapes = Integer.parseInt(line.trim());
            shapes = new Shape[numShapes];
            int index = 0;
            
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length < 3) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }
                String type = parts[0];
                Double param1 = Double.parseDouble(parts[1]);
                Double param2 = Double.parseDouble(parts[2]);
                Shape shape = null;
            switch (type.toLowerCase()) {
                    case "cylinder":
                        shape = new Cylinder(param1, param2);
                        break;
                    case "cone":
                        shape = new Cone(param1, param2);
                        break;
                    case "pyramid":
                        shape = new Pyramid(param1, param2);
                        break;
                    case "octagonalprism":
                        shape = new OctagonalPrism(param1, param2);
                        break;
                    case "pentagonalprism":
                        shape = new PentagonalPrism(param1, param2);
                        break;
                    case "triangularprism":
                        shape = new TriangularPrism(param1, param2);
                        break;
                    case "squareprism":
                        shape = new SquarePrism(param1, param2);
                        break;
                    default:
                        System.out.println("Unknown shape type: " + type);
                        continue;
                }
                shapes[index++] = shape;
            }

            if (index != numShapes) {
                System.out.println("Warning: Number of shapes in file does not match the specified count.");
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return shapes;
    }
//end of class
}

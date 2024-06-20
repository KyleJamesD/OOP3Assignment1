# OOP3Assignment1

# ShapeComparator

This program organizes  a collection of shapes from largest to smallest based upon one of the three defining attributes:
height, area or volume. It includes 6 different sorting methods able to achieve this task, allowing the user to select the desired algoritm at run time one. The program also displays to the console the time it takes to sort the Shapes and the first last and every 1000th shape that is sorted.
The program is capable of sorting the following shapes with their appropraite attributes.

* Cone
* Cylinder
* Pyramid
* Octogonal Prism
* Pentagonal Prism
* Square Prism
* Triangular prism

### Dependencies

This program requires the JVM (Java Virtual machine) be installed on the PC/mac in order to execute the jar file.
This program requires windows 10 or newer and Mac OS 16 or newer.

### Installing

1. unzip the ShapeComparator.zip folder 
2. navigate to the folder _________ where Sort.jar and Shapes.txt is located.

### Executing program

1. In order to run the program the user will open a command prompt window and navigate to the directory ___________ where the Sort.jar  
file is located, then simply type into the console: java -jar Sort.jar -ta -sq -f"res/shapes2".txt

-s is the choice of sorting algorithm, this argument expects a char (upper  or lowercase) for the following Algorithms to sort the 
Shapes.txt data: 

* b= bubble Sort 
* i= Insertion sort 
* s= selection sort 
* q= quick sort 
* m= merge sort 
* x= x sort.

-t is the choice of comparison type, this argument expect a char (upper or lowercase) for the following comparison types: 

* a = Area 
* v= volume
* h= height

-f is for the file path where the shape data is located(shapes1, shapes2, shapes3). 
This shape data should be in the same folder as the Sort.jar file for simplicity of the file path, otherwise a absolute or relative 
path will be required to the text files you wish to sort.

* Please note the Shapes1.txt or Shapes2.txt or Shapes3.txt MUST be in the same folder in order for the file path -f"res/shapes2".txt to work! 


### Complexity Analysis of Algorithm X

* 
* 
* 
* 
1. 
2. 
3. 
4. 

## Authors
* Kyle Dyck 
* 
* 
* 

## Version History

*  Version 1.0

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [PurpleBooth](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2)
* [dbader](https://github.com/dbader/readme-template)
* [zenorocha](https://gist.github.com/zenorocha/4526327)
* [fvcproductions](https://gist.github.com/fvcproductions/1bfc2d4aecb01a834b46)
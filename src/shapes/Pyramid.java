package shapes;
public class Pyramid
{
    double height;
    double side;
    double area;
    double volume;

    public Pyramid(double height, double edgelength) {
        this.height = height;
        this.side = edgelength;
        this.area = calcBaseArea();
        this.volume = calcVolume();
    }
    
   
    
    
    
    private double calcBaseArea(){
        
        double area = side * side;
        return area; 
    }
    
    private double calcVolume(){
        
        double volume = (1.0/3.0) * side * side * height;
        return volume;
    }
    
 
//end class
}

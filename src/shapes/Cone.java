package shapes;
import static java.lang.Math.PI;

public class Cone
{

    //fields for cone class
    double height;
    double radius;
    double area;
    double volume;

    
    //constructor takes two arguments to create object and automatically calculates volume and area.
    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
        this.area = calcBaseArea();
        this.volume = calcVolume();
       
    }
    
    
   

    private double calcBaseArea(){
        double area = PI * this.radius * this.radius;
        return area;  
    }
    

    private double calcVolume(){ 
        double volume = (1.0/3.0) * PI * (this.radius*this.radius)*this.height;
        return volume;
    }
   
    //end class
}

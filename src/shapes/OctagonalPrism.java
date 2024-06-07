package shapes;





public class OctagonalPrism extends Shape
{
    Double height;
    Double side;
    Double area;
    Double volume;

    public OctagonalPrism(Double height, Double side) {
        this.height = height;
        this.side = side;
        this.area = calcBaseArea();
        this.volume = calcVolume();
    }

    public Double getHeight() {
        return height;
    }

    public Double getArea() {
        return area;
    }

    public Double getVolume() {
        return volume;
    }
    
    
    
    
    
    
    
    
    
    public Double calcBaseArea(){
        double area1 = 2 * (1 + Math.sqrt(2)) * this.side * this.side;
        return area1;
    }
    
    public Double calcVolume(){
        double volume1 = this.area * this.height;
        return volume1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  //end class  
}

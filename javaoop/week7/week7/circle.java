package week7;


public class circle extends shape{

    private double r;
    public double pi =3.14;

    public circle(double r){
     
       this.r=r;
       desc = "Circle";

    };

    @Override
    public double Area() {
        
        return 2*pi*r*r;
    }

    @Override
    public double Perimeter() {
        
        return 2*pi*r;
    }
    
}

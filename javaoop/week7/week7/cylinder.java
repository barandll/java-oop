package week7;

public class cylinder extends circle {

    private double h;

    public cylinder(double r , double h) {
        super(r);
        this.h = h;
        desc = "Cylinder";
    } 

    public double getDimensionH(){
         
        return h;
    }

    public double Volume(){

        return super.Area()*getDimensionH();
    }

    public double Area(){

        return 2*(super.Area())+(super.Perimeter()*getDimensionH());
    }

    public double Perimeter(){

        return 4*(super.Perimeter()) + 2+getDimensionH();
    }


    
}

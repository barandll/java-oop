package week7;

public class rectange extends shape {

     private double a;
     private double b;

    public rectange(double a, double b){
     
         this.a = a;
         this.b = b; 
         desc="Rectangle";

    }

    public double getDimensionA(){

        return a; 
    }

    public double getDimensionB(){

        return b; 
    }


    @Override
    public double Area(){

        return a*b;
    }

    @Override
    public double Perimeter(){
        
        return 2*(a+b);
    }

    
    
}

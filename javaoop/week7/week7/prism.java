package week7;

public class prism extends rectange {

    private double c;

    public prism(double a, double b,double c) {
        super(a, b);
        this.c = c;
        desc="Prism";
    }

     public double getDimensionC(){
         
        return c;
    }

    @Override
    public double Area() {
        
        return 2*(getDimensionA()*getDimensionB()+
                  getDimensionA()*getDimensionC()+
                  getDimensionB()*getDimensionC());
    }

    @Override
    public double Perimeter(){
        
        
        return 4*(getDimensionA()+
                  getDimensionB()+
                  getDimensionC());
    }


    public double Volume(){

        return super.Area()*getDimensionC();
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Volume "+ Volume());
    }
    
}

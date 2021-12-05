package week7;

public abstract class shape {

    protected String desc;
    public abstract double Area();
    public abstract double Perimeter();
    public void getInfo(){
        System.out.println("----"+desc+"----");
        System.out.println("Area "+ Area());
        System.out.println("Perimeter "+ Perimeter());
    }

    
}

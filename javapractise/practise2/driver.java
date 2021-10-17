package practise2;

public class driver {
	
public static void main(String[] args) {
        
	     
        admin ad = new admin("Bill Monroe", 75002.34, 304, "108-23-6509");
	     
        Manager man = new Manager("Barbara Johnson",109501.36,207,"054-12-2367","US Marketing");
        
        engineer eng =new engineer("Jame Smith", 120345.27, 101, "012-34-5678");
        
        Director drc = new Director("Susan Wheeler", 120567.36, 12, "099-45-2340","Global Marketing", 1000000.00);
        
        
      
        eng.getInfo();

        man.getInfo();

        ad.getInfo();
        
        drc.getInfo();
    }

}
package week4a;

public class runner {

 public static void main(String[] args) {

    elevator el1 = new elevator();
    building b1 =new building();

    b1.setTop(5);
    b1.setBot(1);

    el1.board(5);
    el1.move(4);
    el1.exit(5);
    el1.call(4);
    
    
    
       
    

    

   }
    
}

package week4c;

import java.util.Random;

public class runner {

    public static void main(String[] args) {
        
        dice d1 = new dice(); //dice of ninja 1
        dice d2 = new dice();  // dice of ninja 2
        ninja n1 = new ninja(); //ninja 1 
        ninja n2 = new ninja();  // ninja 2

        int hp2 = 10;
        int hp1 = 10;

        n1.setHP(10);
        n1.setAP(1);
        n2.setHP(10);
        n2.setAP(1);        

        while((n1.getHP() != 0) || (n2.getHP() !=0) ){

            int num1 = d1.roll();
            int num2 =d2.roll();

            if(num1>num2){

                n1.setState("a");
                n2.setState("d");
                 
            }else if(num2 > num1){

               n2.setState("a");
               n1.setState("d");
               
            }
            
           if(n1.getState() == "a"){

            Random rand = new Random();
            int upperbound = 2;
            int res = rand.nextInt(upperbound);
           
            if(res == 1){

             hp2 = n2.getHP();
             n2.setHP(hp2);
             
            }else if(res == 0){

                hp2 = n2.getHP();
                hp2 = hp2-1;
                n2.setHP(hp2);
                
            }
 
           }else if(n2.getState() == "a"){
               
             Random rand = new Random();
             int upperbound = 2;
             int res2 = rand.nextInt(upperbound);
             
             if(res2 == 1){

              hp1 = n1.getHP();
              n1.setHP(hp1);  

            }else if(res2 == 0){

                hp1 = n1.getHP();
                hp1 = hp1-1;
                n1.setHP(hp1);
              
            }

           }

        }

        if(n1.getHP() == 0){

            System.out.println("ninja 2 won");
        
        }else if(n2.getHP() == 0){

            System.out.println("ninja 1 won");
        }
    }
    
}

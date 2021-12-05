package week4a;

public class elevator extends building{

    public int curFloor = 1;
    public int capacity = 10;
    public int curcapacity=0;

   
    public void call(int where){
        
        System.out.println("elevator going to " + where + " floor");
        curFloor=where;

    }

    public void move(int where){

        if(1 <= where && where <= 5 ){

        if(curcapacity != 0){

        if(where > curFloor){

            System.out.println("elevator going up");
            curFloor = where; 
            System.out.println("elevator is in " + curFloor);
            
        }else if(where<curFloor){

            System.out.println("elevator going down");
            curFloor = where;
            System.out.println("elevator is in " + curFloor);
        }else{

            System.out.println("you are already in " + curFloor + " floor");

        }

      }else System.out.println("please board the elevator");

     }else System.out.println("the floor you said is not existing");

    }

    public void board(int boarder){
       
        if(curcapacity <= 10 && boarder <=10){

         curcapacity = curcapacity+boarder;

      }else System.out.println("capacity is 10 people, some of you needs to wait for the next one");
    }

    public void exit(int leaver){

        if(curcapacity-leaver < 0 ){

            System.out.println("no more people to exit");
        
        }else if(curcapacity-leaver > 0){

            System.out.println("elevator has " + curcapacity +" people" );

        }else System.out.println("elevator is empty");
    }
    
}

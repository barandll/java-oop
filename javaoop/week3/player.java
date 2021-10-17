package week3;

import java.util.Random;

public class player {

    public int score = 0;

    public void shot(){

        Random rand = new Random();
        int upperbound = 2;
        int result = rand.nextInt(upperbound);

        if(result==1){
             
            score++;
            dustbin.AddGarbage();

        }

    }
    
}

package week4c;

import java.util.Random;
import java.util.stream.IntStream;

public class dice {

    int[] face = IntStream.range(1, 101).toArray();

    public int roll(){

        Random rand = new Random();
        int upperbound = 99;
        int result = rand.nextInt(upperbound);

        return face[result];

    }
    
}

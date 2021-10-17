package week3;

public class runner {

    public static void main(String[] args) {
       
       player player1 = new player();
       player player2 = new player();

       while(dustbin.CurrVol != dustbin.Capacity){
          
        player1.shot();
        player2.shot();

       }
       
       if(player1.score > player2.score){

        System.out.println("player 1 won");
       

       }else if(player1.score < player2.score){

        System.out.println("player2 won");
         

       }else System.out.println("its a draw");      
   
   }

}

package week3;

public class dustbin {
    
    public static int Capacity=10;
 
    public static int CurrVol=0;

    public void empty(){
        CurrVol=0;
    }

    public static boolean CurAmount(){
         
        if(CurrVol == Capacity){
            
            return true;

        }else return false;       
    }

    public static void AddGarbage(){

         CurrVol++;
    }

}

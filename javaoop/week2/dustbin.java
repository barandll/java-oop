package week2;

public class dustbin {

    public int Capacity=10;
    
    public int CurrVol=0;

    public boolean lid = true;

    public void empty(){
        CurrVol=0;
    }
    
    public boolean AddGarbage(int Garbage){

        if((lid == true) && (CurrVol+Garbage<=Capacity)){
            CurrVol=CurrVol+Garbage;
            return true;
        
        }else if((lid == false) && (CurrVol+Garbage<=Capacity)){
            
            System.out.println("open the lid first");
            return false;

        }else if((lid== true) && (CurrVol+Garbage>=Capacity)){

            System.out.println("empty the garbage garbage is full");
            return false; 
        }else
          
          return false;
    }

    public int CurAmount(){

        return CurrVol;
    }
    
}

package week4c;

public class ninja {

    private int attackPoint;
    private int healthPoint;
    private String stateAoD;

    
   public void setAP(int x){
    this.attackPoint = x;
   }

   public void setHP(int x){
    this.healthPoint = x;
   }

   public int getAP(){
    return attackPoint;
   }

   public int getHP(){
    return healthPoint;
   }

   public void setState(String x){
    this.stateAoD = x;
   }

   public String getState(){
    return stateAoD;
   }

}



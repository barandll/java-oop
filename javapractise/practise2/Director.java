package practise2;

public class Director extends Manager{
	
	private double budget;
	
	public Director(String Name,double salary,int empId,String ssn, String dept,double budget) {
		
		super(Name,salary,empId,ssn,dept);
		this.budget=budget;
	}

	
	
	
	public double getBudget() {
		
		return budget;
	}
	
	public void getInfo(){
 
		System.out.println("Budget: " + getBudget());
        super.getInfo();
        
    }
}

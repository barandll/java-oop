package practise2;

public class Employee {
    
	private int empId;
	private String Name;
    private String ssn;
    private double salary;

    

    public Employee(String Name, double salary,int empId,String ssn){
      
      setName(Name);
      setSalary(salary);
      setEmpId(empId);
      setSsn(ssn);      
    }
    
    public void setSsn(String ssn) {
    	
    	this.ssn = ssn;
    }
    
    public String getSsn() {
    	
    	return ssn;
    }
    
    public void setEmpId(int empId) {
    	
      	this.empId = empId; 
    }
    
    public int getEmpId() {
    	
    	return empId;
    }
    
    public String getName(){
        return Name;
    }

    public void setName(String name){
        if(name!=null){
            Name = name;
        }
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){

        this.salary = salary;

    }

    public void raiseSalary(double increase) {
    	
    	salary+=increase;
    	
    }
    
    
    
    public void getInfo(){

    	
        System.out.println("Name: " + getName());
        System.out.println("Salary: " +getSalary());
        System.out.println("ID: " + getEmpId());
        System.out.println("ssn: " + getSsn());
        System.out.println(" ");
    }

}

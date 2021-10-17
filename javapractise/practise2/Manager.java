package practise2;

public class Manager extends Employee {

	private String dept;

    public Manager(String Name,double salary,int empId,String ssn, String dept){

        super(Name,salary,empId,ssn);

        this.dept=dept;
    }

    public String getDept(){
        return dept;
    }

    public void getInfo(){

        System.out.println("Department: " + getDept());
        super.getInfo();
    }
}

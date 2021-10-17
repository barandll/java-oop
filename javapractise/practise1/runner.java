package practise1;

public class runner {

  public static void main(String[] args) {
    
    employee E1 = new employee();
    E1.EmployeeID = 101;
    E1.EmployeeName = "Jane Smith";
    E1.EmployeeSSN = "012-34-4567";
    E1.EmployeeSalary = 120.345;

    System.out.println("ID:"+" " + E1.EmployeeID);
    System.out.println("Name:"+" " + E1.EmployeeName);
    System.out.println("Social Security Number:"+" "+E1.EmployeeSSN);
    System.out.println("salary is:"+" "+E1.EmployeeSalary +"$");

  }
      
  

    
}

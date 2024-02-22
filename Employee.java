package task10;

import java.util.Scanner;

public class Employee {

	private int ID;
	private String FirstName;
	private String LastName;
	private double Salary;
	
	public Employee(int ID , String FirstName, String LastName, double Salary) 
	{
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Salary = Salary;
    }
	  public void raiseSalary(double percent) {
	        double raiseAmount = Salary * (percent / 100);
	        Salary += raiseAmount;
	    }

	    // Getter methods
	    public int getId()
	    {
	        return ID;
	    }

	    public String getFirstName() 
	    {
	        return FirstName;
	    }

	    public String getLastName() 
	    {
	        return LastName;
	    }

	    public double getSalary()
	    {
	        return Salary;
	    }

	    public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);

	        // Get employee details from user
	        System.out.print("Enter employee ID: ");
	        int ID = sc.nextInt();
	        sc.nextLine(); 

	        System.out.print("Enter employee first name: ");
	        String FirstName = sc.nextLine();

	        System.out.print("Enter employee last name: ");
	        String LastName = sc.nextLine();

	        System.out.print("Enter employee salary: ");
	        double Salary = sc.nextDouble();

	        // Create Employee object
	        Employee emp = new Employee(ID, FirstName, LastName, Salary);

	        // Get raise percentage from user
	        System.out.print("Enter raise percentage: ");
	        double raisePercent = sc.nextDouble();

	        // Raise employee's salary
	        emp.raiseSalary(raisePercent);

	        // Display updated salary
	        System.out.println("Updated salary: "+emp.getSalary());

	    }
}
	
OUTPUT:
Enter employee ID: 1234
Enter employee first name: Hari
Enter employee last name: v
Enter employee salary: 50000
Enter raise percentage: 20
Updated salary: 60000.0

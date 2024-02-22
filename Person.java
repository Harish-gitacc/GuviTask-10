package task10;

import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	
	public Person(String name ,int age)
	{
		this.name= name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Getting input for name
	        System.out.print("Enter name:");
	        String name = sc.nextLine();

	        // Getting input for age
	        System.out.print("Enter age:");
	        int age = sc.nextInt();

	        // Creating a Person object
	        Person P1 = new Person(name, age);

	        // Displaying the details of the person
	        System.out.println("Name:"+ P1.getName());
	        System.out.println("Age:"+ P1.getAge());

	    }
}


OUTPUT:
Enter name:Hari
Enter age:25
Name:Hari
Age:25

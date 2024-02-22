package task10;

import java.util.Scanner;

public class Circle {
	 private double radius;

	    public Circle() 
	    {
	        this.radius = 0;
	    }

	    public Circle(double radius)
	    {
	        this.radius = radius;
	    }	   
	    public double getRadius() {
	        return radius;
	    }
	    public double calculateCircumference()
	    {
	        return 2 * Math.PI * radius;
	    }
	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();
	        Circle circle = new Circle(radius);
	        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
	    }
}


OUTPUT:
Enter the radius of the circle: 21
Circumference of the circle: 131.94689145077132

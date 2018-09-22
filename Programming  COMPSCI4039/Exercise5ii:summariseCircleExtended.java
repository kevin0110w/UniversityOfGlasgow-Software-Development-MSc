/*
Using your summariseCircle method from the methods exercises, write a program that asks the user to enter the radius of a circle and then, using the radius, calls the summariseCircle method. Your radius should be a double...fortunately Scanner helps us here with nextDouble().

*/

import java.util.Scanner;

public class Lab5Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a radius: ");
		double radius = scanner.nextDouble();
		summariseCircle(radius);
		scanner.close();
	}

	public static double compArea(double radius) {
		double pi = 3.14125;
		double area = pi * radius * radius;
		return area;
	}
	
	public static double compCircumference(double radius) {
		double pi = 3.14125;
		double circumference = 2 * pi * radius;
		return circumference;
	}
	
	public static void summariseCircle(double radius) {
		double areaCircle = compArea(radius);
		System.out.println("The area of a circle with radius " +
		radius + ", is " + areaCircle);
		double circumferenceCircle = compCircumference(radius);
		System.out.println("The circumference of a circle with radius " +
				radius + ", is " + circumferenceCircle);
	}

}
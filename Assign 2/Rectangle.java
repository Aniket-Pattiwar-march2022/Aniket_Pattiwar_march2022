//13. Write a Java program to print the area and perimeter of a rectangle.

import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);

System.out.println("Input Length:");
double l = sc.nextDouble();

System.out.println("Input Breadth:");
double b = sc.nextDouble();

	System.out.println("Perimeter = "+(2*(l+b)));


	System.out.println("Area = "+(l*b));

}

}
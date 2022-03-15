//11. Write a Java program to print the area and perimeter of a circle. 


import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);
final double pi=3.14159265359;

System.out.println("Input Radius");
double R = sc.nextDouble();

	System.out.println("Perimeter = "+(2*pi*R));


	System.out.println("Area = "+(pi*R*R));

}

}
//12. Write a Java program that takes three numbers as input to 
//calculate and print the average of the numbers. 

import java.util.Scanner;
class Avg
{
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);
	 
System.out.println("Enter 1st No.");
double n1 = sc.nextDouble();

System.out.println("Enter 2nd No.");
double n2 = sc.nextDouble();

System.out.println("Enter 3rd No.");
double n3 = sc.nextDouble();

	double Avg = (n1+n2+n3)/3;

	System.out.println("Avg = "+Avg);

}

}
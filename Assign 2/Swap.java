//15. Write a Java program to swap two variables.




import java.util.Scanner;
class Swap
{
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);

System.out.println("Input 1st variable:");
double a = sc.nextDouble();

System.out.println("Input 2nd variable:");
double b = sc.nextDouble();

	System.out.println();
	System.out.println("Before Swapping: ");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
	
	System.out.println();
	System.out.println("After Swapping: ");
	System.out.println("a= "+b);
	System.out.println("b= "+a);

}

}
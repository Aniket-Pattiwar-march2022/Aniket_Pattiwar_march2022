5. Write a Java program that takes two numbers as input and display the product of
two numbers. 


import java.util.Scanner;
class Product
{
public static void main(String args[])
{
	 Scanner sc = new Scanner(System.in);

System.out.println("Input First no.");
int n1= sc.nextInt();
System.out.println("Input Second no.");
int n2= sc.nextInt();
System.out.println("Product= "+n1+"*"+n2+" = "+n1*n2);





}
}
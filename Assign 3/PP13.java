/*
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/
class PP13
{
public static void main(String args[])
{
for(int i=5;i>=1;i--)
{
for (int n=5-i;n>=1;n--)
{System.out.print(" ");
}
for (int l=1;l<=i;l++)
{System.out.print("*");
}
System.out.println();
}

for(int a=2;a<=5;a++)
{
	for (int n=5-a;n>=1;n--)
{System.out.print(" ");
}
	for(int b=1;b<=a;b++)
	{System.out.print("*");
    }
	System.out.println();
}

/*
for (int j=1;j<=5;j++)
{
System.out.print("*");
}

for (int k=i-1;k>=1;k--)
{System.out.print(" "+k);
}
*/




}
}
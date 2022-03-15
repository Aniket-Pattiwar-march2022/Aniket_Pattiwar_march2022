/*
		 1
       1  2
     1  2  3
   1  2  3  4
 1  2  3  4  5
*/
class P7
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{
for (int l=4;l>=i;l--)
{System.out.print("  ");
}

for (int j=1;j<=i;j++)
{
System.out.print(" "+j+" ");
}
//for (int k=i-1;k>=1;k--)
//{System.out.print(" *");
//}
System.out.println();
}


}
}
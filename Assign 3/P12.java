/*

        1
       2  2
     3  3  3
   4  4  4  4
 5  5  5  5  5

*/
class P12
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
System.out.print(" "+i+" ");
}
//for (int k=i-1;k>=1;k--)
//{System.out.print(" *");
//}
System.out.println();
}


}
}
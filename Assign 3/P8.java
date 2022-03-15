/*
         5
       4  5
     3  4  5
   2  3  4  5
 1  2  3  4  5
 
 */
class P8
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{int a=6-i;
for (int l=4;l>=i;l--)
{System.out.print("  ");
}

for (int j=1;j<=i;j++)
{
System.out.print(" "+a+++" ");
}
//for (int k=i-1;k>=1;k--)
//{System.out.print(" *");
//}
System.out.println();
}


}
}
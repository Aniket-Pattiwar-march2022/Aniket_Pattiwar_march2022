/*

 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5
 
 */
class P15
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
{

for (int j=5;j>=i;j--)
{
System.out.print(" "+j);
}
//for (int k=i-1;k>=1;k--)
//{System.out.print(" "+k);
//}

//for (int l=7;l>=i;l--)
//{System.out.print("  ");
//}
System.out.println();
}


}
}
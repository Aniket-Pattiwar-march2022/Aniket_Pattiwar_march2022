/*

*****
*  *
* *
**
*


*/
class HollowHalf
{
public static void main(String args[])
{
for(int i=1;i<=6;i++)
{
for (int j=1;j<=6-i;j++)
{ if ( j>=2 && i>=2 && j!=6-i)
   {System.out.print(" ");}
else
System.out.print("*");
}


System.out.println();
}


}
}
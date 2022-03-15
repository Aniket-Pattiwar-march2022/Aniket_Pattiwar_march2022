/*
 A B C D E
 A B C D
 A B C
 A B
 A
 */
 
class P18
{
public static void main(String args[])
{
for(char i='E';i>='A';i--)
{

for (char j='A';j<=i;j++)
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
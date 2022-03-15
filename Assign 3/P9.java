/*
		 A
       A  B
     A  B  C
   A  B  C  D
 A  B  C  D  E
 */
class P9
{
public static void main(String args[])
{
for(char i='A';i<='E';i++)
{
for (char l='D';l>=i;l--)
{System.out.print("  ");
}

for (char j='A';j<=i;j++)
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
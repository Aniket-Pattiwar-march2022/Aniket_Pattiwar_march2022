/*  
         A
       B  B
     C  C  C
   D  D  D  D
 E  E  E  E  E
 
 */
class P13
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
System.out.print(" "+i+" ");
}
//for (int k=i-1;k>=1;k--)
//{System.out.print(" *");
//}
System.out.println();
}


}
}
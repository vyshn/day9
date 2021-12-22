import java.util.*;
class day52
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    char c='A';
  for(int i=0;i<=n;i++)
    {
    for(int j=0;j<=i;j++)
    {
     System.out.print((char)(c+j));
    }
   System.out.println();
  }
 }
}
OUTPUT:
D:\vyshnavi>java day52
4
A
AB
ABC
ABCD
ABCDE

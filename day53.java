import java.util.*;
class day53
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
     {
      System.out.print("*");
     }
   System.out.println();
   }
}
OUTPUT:
D:\vyshnavi>javac day53.java

D:\vyshnavi>java day53
5
*
**
***
****
*****


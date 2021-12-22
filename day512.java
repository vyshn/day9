import java.util.*;
class Day512
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int space;
    space=n-1;
    for(int i=1;i<=n;i++)
    {
     for(int j=1;j<=space;j++)
    {
     System.out.print(" ");
   } 
   space--;
    for(int j=1;j<=i;j++)
    {
   System.out.print(i+" ");
   }
  System.out.println();
  }
 } 
}
OUTPUT:
D:\vyshnavi>javac Day512.java

D:\vyshnavi>java Day512
5
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

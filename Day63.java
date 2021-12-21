import java.util.*;
class Day63
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=i;j++)
    {
    if(j==i||j==1||i==n)
     System.out.print(" "+j);
    else
     System.out.print(" ");
    }
  System.out.println();
  }
}
}
OUTPUT:
D:\vyshnavi>javac Day63.java

D:\vyshnavi>java Day63
5
 1
 1 2
 1  3
 1   4
 1 2 3 4 5

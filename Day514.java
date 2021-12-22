import java.util.*;
class Day514
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=5;i>0;i--)
    {
     for(int j=1;j<=i;j++)
    {
   
   System.out.print(j+" ");
   }
  System.out.println();
  }
 } 
}
OUTPUT:
D:\vyshnavi>javac Day514.java

D:\vyshnavi>java Day514
5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
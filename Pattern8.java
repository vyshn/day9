import java.util.*;
class Pattern8
{
   public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=n;i>=1;i--)
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
C:\vyshu>javac Pattern8.java

C:\vyshu>java Pattern8
5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
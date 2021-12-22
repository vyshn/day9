import java.util.*;
class day59
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int space;
  char ch='A';
  space=n-1;
  for(int i=0;i<=n;i++)
  {
    for(int j=0;j<=space;j++)
     {
      System.out.print(" ");
     }
     space--;
     for(int j=0;j<=i;j++)
     {
     System.out.print((char)(ch+j)+" ");
   }
   System.out.println();
   }
}
}
OUTPUT:

D:\vyshnavi>javac day59.java

D:\vyshnavi>java day59
4
    A
   A B
  A B C
 A B C D
A B C D E

  



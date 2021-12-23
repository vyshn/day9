import java.util.*;
class Fibanocci
{
  public static void main(String args[])
  {
   int n1=0,n2=1,n3;
   int count=0;
   System.out.print(+n1+" "+n2);
   for(int i=0;i<=10;i++)
   {
    n3=n1+n2;
    System.out.print(" "+n3);
    n1=n2;
    n2=n3;
   }
  }
}
OUTPUT:
D:\vyshnavi>javac Fibanocci.java

D:\vyshnavi>java Fibanocci
0 1 1 2 3 5 8 13 21 34 55 89 144
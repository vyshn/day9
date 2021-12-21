import java.util.*;
class Day91
{
 public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int rows=sc.nextInt();
  int coloumn=sc.nextInt();
   for(int i=1;i<=rows;i++)
   {
     for(int j=1;j<=coloumn;j++)
     {
      if(i==1||i==rows||j==coloumn||j==1)
         System.out.print("*");
       else
         System.out.print(" ");
        }
       System.out.println();
   }
}
}
 OUTPUT:
D:\vyshnavi>javac Day91.java

D:\vyshnavi>java Day91
3
5
*****
*   *
*****
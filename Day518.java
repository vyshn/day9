import java.util.*;
class Day518
{
  public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  
    char ch='A';
   
    for(int i=5;i>0;i--)
    {
     for(int j=0;j<i;j++)
    {
   
   System.out.print((char)(ch+j));
   }
  System.out.println();
  }
 } 
}
OUTPUT:
D:\vyshnavi>javac Day518.java

D:\vyshnavi>java Day518
4
ABCDE
ABCD
ABC
AB
A
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
     for(int j=0;j<=i;j++)
    {
   
   System.out.print((char)(ch+i)+" ");
   }
  System.out.println();
  }
 } 
}

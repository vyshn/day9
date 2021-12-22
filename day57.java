import java.util.*;
class day59
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
     System.out.print((char)(ch+j)+" ");
   }
   System.out.println();
   }
}
}
  



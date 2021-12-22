import java.util.*;
class day55
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   char c='A';
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
     {
      System.out.print((char)(c+i));
     }
   System.out.println();
   }
}
}

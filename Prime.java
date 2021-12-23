import java.util.*;
class Prime
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  int num=0;
  String primenumbers="";
  for(int i=1;i<=100;i++)
  { 
  int count=0;
  for(num=i;num>=1;num--)
{
   if(i%num==0)
   {
    count=count+1;
   }
 }
  if(count==2)
   primenumbers=primenumbers+i+" ";
  }
   System.out.println("primenumbers are:");
   System.out.println(primenumbers);
  }
}
OUTPUT:
D:\vyshnavi>javac Prime.java

D:\vyshnavi>java Prime
primenumbers are:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

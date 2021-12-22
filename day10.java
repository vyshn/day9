import java.util.*;
 class day10
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     String str1=sc.next();
     int n = sc.nextInt();
     int m = sc.nextInt();
     System.out.println("length of the string :"+str.length());
     System.out.println("character at particular index :"+str.charAt(n));
     System.out.println(String.format(str));
     System.out.println("sub string is :"+str.substring(1));
     System.out.println("sub string at start index to end index :"+str.substring(n,m));
     if(str.isEmpty())
       System.out.println("is  empty");
      else
       System.out.println("is full");
     System.out.println("adding the two Strings :"+str.concat(str1));
     System.out.println("replaced the value :"+str.replace("str1","vidya")); 
     if(str.equalsIgnoreCase(str1))
       System.out.println("two strings are equals");
      else
       System.out.println("not equal");
      System.out.println("split the string :"+str.split("r"));
      System.out.println("covert into lower case :"+str.toLowerCase());
      System.out.println("covert into upper case :"+str1.toUpperCase());
      System.out.println("the intered string :"+str.intern());
      String str2="  REDDY ";
      System.out.println("removes the spaces :"+str2 .trim());

     
  }
 }
OUTPUT:
D:\vyshnavi>javac day10.java

D:\vyshnavi>java day10
vyshnavi
praveena
2
4
length of the string :8
character at particular index :s
vyshnavi
sub string is :yshnavi
sub string at start index to end index :sh
is full
adding the two Strings :vyshnavipraveena
replaced the value :vyshnavi
not equal
split the string :[Ljava.lang.String;@b4c966a
covert into lower case :vyshnavi
covert into upper case :PRAVEENA
the intered string :vyshnavi
removes the spaces :REDDY
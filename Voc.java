import java.io.*;
import java.util.*;
class Voc
{
 public static void main(String args[])
{
 Scanner n=new Scanner(System.in);
  System.out.println("enter the charecter:");
 char vc=n.next().charAt(0);
  if(vc=='a' || vc=='e' || vc=='i' || vc=='o' || vc=='u' || vc=='A' || vc=='E' || vc=='I' || vc=='O' || vc=='U')
{
System.out.println("given char is vowel"+" "+vc);
}
else 
{
System.out.println("given char is consonent"+" "+vc);
}
}
}

import java.util.Scanner;
class Bank
{
 static int getInterest()
 {
  int s=8;
  int i=7;
  int a=9;
  return 0;}
}
class SBI extends Bank
{
 static int getInterest()
 {
  return s;
 }
}
class ICICI extends Bank
{
 static int getInterest()
 {
  return i;
 }
}
class AXIX extends Bank
{
 static int getInterest()
 {
  return a;
 }
}
class main
{
 public static void main(String[] args)
 {
   SBI s1=new SBI();
   ICICI i1=new ICICI();
   AXIX a1=new AXIX();
   System.out.println(s1.getInterest());
   System.out.println(i1.getInterest());
   System.out.println(a1.getInterest());
 }
}
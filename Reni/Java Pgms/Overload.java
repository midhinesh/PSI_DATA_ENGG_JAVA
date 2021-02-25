class addition
{
 static int add(int a,int b)
 {
  return a+b;
 }
 static int add(int a,int b,int c,int d)
 {
  return a+b+c+d;
 }
 static float add(float a,float b){
 return a+b;}
}
public class Overload
{
 public static void main(String[] args)
 {
  System.out.println(addition.add(2,3));
  System.out.println(addition.add(2,3,5,7)); 
  System.out.println(addition.add(2.0f,3.0f));
 }
}
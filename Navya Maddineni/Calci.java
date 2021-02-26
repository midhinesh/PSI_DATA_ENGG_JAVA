import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter tne numbers:");
	int n1,n2;
	n1=scan.nextInt();	
	n2=scan.nextInt();	
	add(n1,n2);
	sub(n1,n2);
	multi(n1,n2);
	div(n1,n2);
	}
	public static void add(int a,int b)
	{
		System.out.println("Sum of two numbers:"+(a+b));
	}
	public static void sub(int a,int b)
	{
		System.out.println("Substraction of two numbers:"+(a-b));
	}
	public static void multi(int a,int b)
	{
		System.out.println("Product of two numbers:"+(a*b));
	}
	public static void div(int a,int b)
	{
		System.out.println("Division of two numbers:"+(a/b));
	}
}
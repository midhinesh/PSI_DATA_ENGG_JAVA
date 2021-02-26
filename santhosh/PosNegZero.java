import java.util.*;
 
class PosNegZero
{
    public static void main(String []args)
    {
        int num;
        Scanner in=new Scanner(System.in);
         
        System.out.print("Enter any integer number: ");
        num=in.nextInt();
         
        if(num>0)
            System.out.println(num + " is Positive Number");
        else if(num<0)
            System.out.println(num + " is Negative Number");
        else
            System.out.println("IT's Zero");
         
    }
}
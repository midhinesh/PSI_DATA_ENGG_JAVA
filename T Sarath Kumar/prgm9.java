import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        if(n>0)
        {
            System.out.println("positive number");

        }
        else if(n<0)
        {
            System.out.println("negative number");

        }
        else
            {
            System.out.println("Zero");
        }
    }
}

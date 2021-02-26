

class Main {
    public static void main(String[] args) {
        int s = 2000;
        if(s%100==0)
        {
            if(s%400==0)
            {
                System.out.println("leap year");
            }
            else
            {
                System.out.println(" not a leap year");
            }
        }
        else
        {
            if(s%4==0)
            {
                System.out.println("leap year");
            }
            else {
                System.out.println("not a leap year");
            }
        }


    }
}
class leap{
public static void main(String args[]){
int y=1997;
if(y%4==0 && y%100!=0 || y%400==0)
{
System.out.println("leap Year");
}
else
{
System.out.println("not leap yr");
}
}
}

class check{
public static void main(String args[])
{
int a=-5;
if(a>0)
{
System.out.println("Positive");
}else if(a<0)
{
 System.out.println("negative");
}
else
{
System.out.println("zero");
}
}
}

class months{
public static void main(String args[])
{
int m=5;
switch(m){
case 1:System.out.println("jan");
       break;
case 2:System.out.println("feb");
       break;
case 3:System.out.println("march");
       break;
case 4:System.out.println("april");
       break;
case 5:System.out.println("may");
       break;
case 6:System.out.println("june");
       break;
case 7:System.out.println("july");
       break;
case 8:System.out.println("aug");
       break;
case 9:System.out.println("sep");
       break;
case 10:System.out.println("oct");
       break;
case 11:System.out.println("nov");
       break;
case 12:System.out.println("dec");
       break;
default:System.out.println("wrng input");
}
}
}

class alpha{
public static void main(String args[])
{
char a='z';
if(a=='a'|| a=='e'|| a=='i' || a=='o' || a=='u')
{
System.out.println("vowel");
}
else
{
System.out.println("consonant");
}
}
}



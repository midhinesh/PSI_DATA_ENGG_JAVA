import java.io.File;
class file{
public static void main(String args[])
{
File op=new File("fp.txt");

try{
boolean value=op.createNewFile();
if(value)
{
System.out.println("file created ");
}
else
{
System.out.println("not created");
}
}
catch(Exception e)
{
e.getStackTrace();
}
}
}
import java.io.FileReader;
import java.io.*;
class copy{
public static void main(String args[]){
char a[]=new char[50];
try{
FileReader fp1=new FileReader("read1.txt");
FileWriter fp2=new FileWriter("fp.txt");
fp1.read(a);
fp2.write(a);
fp1.close();
fp2.close();

}
catch(Exception e)
{
e.getStackTrace();
}
}

}
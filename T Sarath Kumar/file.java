import java.io.File;

class file{

public static void main(String[] args)
   {

	File f=new File("asd.txt");
	try{

	    boolean b=f.createNewFile();
	    if(b)
		{
		System.out.println("file created");
		}
		else{
		System.out.println("file exist");
			}
		}
	catch(Exception e){
		e.getStackTrace();
		}


	}
}
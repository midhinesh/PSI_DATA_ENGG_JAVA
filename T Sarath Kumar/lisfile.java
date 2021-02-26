import java.io.File; 
  
public class lisfile { 
    public static void main(String[] args) 
    { 
      String[] path;
	File f= new File("D:\\strng");
	path=f.list();
	for(String s:path){
		System.out.println(s);

		}
	
    } 
} 
// Java program to rename a file. 
import java.io.File; 
 class frename { 
	public static void main(String[] args) 
	{ 
		File oldName = new File("C:/Users/thosowmy/Desktop/Java_Pgms/newFile.txt"); 
		File newName = new File("C:/Users/thosowmy/Desktop/Java_Pgms/Filerename.txt"); 

		if (oldName.renameTo(newName)) 
			System.out.println("Renamed successfully");		 
		else
			System.out.println("Error");		 
	} 
} 

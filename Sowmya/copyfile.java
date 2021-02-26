import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
  class CopyExample {
   public static void main(String[] args) {
      FileInputStream ins = null;
      FileOutputStream outs = null;
      try {
           System.out.println("Enter the first path ");
           Scanner s = new Scanner(System.in);
           String path1 = s.next();
         File infile = new File(path1);
         System.out.println("Enter the second path");
         s = new Scanner(System.in);
         String path2 = s.next();
         File outfile = new File(path2);
         ins = new FileInputStream(infile);
         outs = new FileOutputStream(outfile);
         byte[] buffer = new byte[1024];
         int length;
         
         while ((length = ins.read(buffer)) > 0) {
            outs.write(buffer, 0, length);
         } 
         ins.close();
         outs.close();
         System.out.println("File copied successfully!!");
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } 
   }
}
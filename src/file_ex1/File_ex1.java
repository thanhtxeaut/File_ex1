/*
tao file trong o E:/
 */
package file_ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_ex1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       // mo file E:/input.txt
       Scanner inp = new Scanner (System.in);
     
       
       // ghi file
        try (FileWriter fw = new FileWriter("E:\\writer.txt"))
        {
            int a;
            a =2;
            fw.write(a);
            fw.close();
       }catch(FileNotFoundException e){
          System.out.println(" Xay ra ngoai le! "+ e.toString());
      }
      finally{
          System.out.println(" Ket thuc chuong trinh. ");
        }
        
          // doc file
       try(FileReader fr = new FileReader("E:\\writer.txt"))
        {
           int str;
            while((str= fr.read())!=-1)
            {
                System.out.print("\n Doc file: "+str);
            }
       }
        
        
            
//       FileInputStream in  =null;
//       FileOutputStream out = null;
//      try{
//        // mo hoac tao file out de ghi du lieu (write)
//       out = new FileOutputStream("E:\\output.txt");
//       System.out.println(" Ghi du lieu vao file out \n Nhap gia tri can ghi: ");
//       int a;
//       a = inp.nextInt();
//       out.write(a);
//         // mo de doc du lieu
//       in = new FileInputStream("E:\\input.txt");
//       System.out.println(" Doc du lieu tu file input: ");
//       int c; // chua du lieu doc duoc
//      do{
//          c=in.read();
//          System.out.print((char)c);
//       }while(c!=-1);
//      
//      }catch(FileNotFoundException e){
//          System.out.println(" Xay ra ngoai le! "+ e.toString());
//      }
//      finally{
//          System.out.println(" Ket thuc chuong trinh. ");
//      }
        
    }
    
}

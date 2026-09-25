package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("FileHandling/abc.txt",true);
            String data=" "+sc.nextLine();
            byte byteData[]=data.getBytes();
            fos.write(byteData);
            fos.close();
            
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        sc.close();
    }
}

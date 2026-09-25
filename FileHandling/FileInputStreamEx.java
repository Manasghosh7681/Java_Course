package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("FileHandling/abc.txt");
            while(true){
                int ch=fis.read();
                if(ch==-1){
                    break;
                }
                System.out.print((char)ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}

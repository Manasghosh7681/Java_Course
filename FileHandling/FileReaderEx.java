package FileHandling;

import java.io.IOException;
import java.io.FileReader;

public class FileReaderEx {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("FileHandling/abc.txt");
            while (true) {
                int data = fr.read();
                if (data == -1) {
                    break;
                }
                System.out.print((char) data);

            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

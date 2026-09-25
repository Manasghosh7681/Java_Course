package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("FileHandling/abc.txt"));
            String data = br.readLine();
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
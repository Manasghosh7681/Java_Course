package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {
    public static void main(String[] args) {
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("FileHandling/abc.txt",true));
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter data to write in File");
            String data=sc.nextLine();
            bw.write(data);
            sc.close();
            bw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        try{
            FileWriter fr=new FileWriter("FileHandling/abc.txt",true);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter data to write in file");
            String data="\n"+sc.nextLine();
            fr.write(data);
            sc.close();
            fr.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

package FileHandling;
import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try{

            File f1=new File("abc.txt");
            if(f1.exists()){
                System.out.println("File exist");
                System.out.println(f1.getAbsolutePath());
                System.out.println(f1.getName());
                System.out.println(f1.canRead());
                System.out.println(f1.canWrite());
                System.out.println(f1.length());
                f1.delete();
            }else{
                f1.createNewFile();
                System.out.println("File created");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

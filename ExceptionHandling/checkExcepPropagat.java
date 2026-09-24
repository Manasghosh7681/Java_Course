package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileOperation{
    public void readfile() throws FileNotFoundException{
        FileReader f=new FileReader("abc.txt");
        
    }
}

public class checkExcepPropagat {
    public static void main(String[] args) {
        FileOperation fp=new FileOperation();
        try{
            fp.readfile();
        }catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }
    }
}

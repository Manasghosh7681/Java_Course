package ExceptionHandling;
import java.lang.Exception;;

class InvalidAgeException extends Exception {


    public InvalidAgeException(String message) {
        super(message);
        
    }
   
}

class Employee{
    public void checkage(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You are not eligible for employee");
        }else{
            System.out.println("You are eligible");
        }
    }
}

public class checkCustomException {
public static void main(String[] args) {
    Employee e=new Employee();
    try{
        e.checkage(10);
    }catch(InvalidAgeException ag){
        System.out.println(ag.getMessage());
    }
}
}

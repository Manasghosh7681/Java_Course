package ExceptionHandling;
import java.lang.RuntimeException;

class InvalidAge extends RuntimeException{
    public String message;
    InvalidAge(String message){
        this.message=message;
    }
    public String displayMessage(){
        return this.message;
    }
}

class Student{
    public void checkAge(int age){
        if(age<10){
            throw new InvalidAge("Need Matric Pass");
        }else{
            System.out.println("Matric pass");
        }
    }
}

public class UncheckCustomExcept {
    public static void main(String[] args) {
        Student s=new Student();
        try{
            s.checkAge(6);
        }catch(InvalidAge e){
            System.out.println(e.displayMessage());
        }
    }
}

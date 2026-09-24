package ExceptionHandling;
class AgeExeception{
    public void checkage(int age){
        if(age<18){
            throw new ArithmeticException("you are not eligible");
        }
    }
}

public class UncheckExcepPropagation {
    public static void main(String[] args) {
        AgeExeception age=new AgeExeception();
       try{
         age.checkage(10);
       }catch(ArithmeticException ae){
        System.out.println(ae.getMessage());
       }
    }
}

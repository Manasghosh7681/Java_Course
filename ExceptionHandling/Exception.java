package ExceptionHandling;

public class Exception {
    public static void main(String[] args) {
        try{
        System.out.println(10/0); //it gives arithmetic exception

        String s=null;
        System.out.println(s.length()); //Null pointer exception

        int arr[]={10,20,30};
        System.out.println(arr[8]); //Array index ot of bound exception
        Integer a=Integer.parseInt("abc");
        System.out.println(a);  //Number format Exception
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException np){
            System.out.println("Exception caught:"+np.getMessage());
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        }catch(NumberFormatException ne){
            System.out.println(ne.getMessage());
        }
    }
}

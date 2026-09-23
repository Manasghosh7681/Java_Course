package Abstraction_Interface;
interface Payment{
    public static final double TAX=0.02;
    abstract public void calculateTotalAmount(double amount);
    public static boolean checkValidAmount(double amount){
        if(amount>0){
            return true;
        }
        return false;
    }
    default double processPayment(double amount){
        logVAlue(amount);
        
            return amount*TAX+amount;
        
     
    }
    //Helper function
    private void logVAlue(double amount){            //support in java 9 onWards
        System.out.println(amount);
    }
}
class RazorPay implements Payment{
    @Override
    public void calculateTotalAmount(double amount){
        if(Payment.checkValidAmount(amount)){
            System.out.println(processPayment(amount));
        }else{
            System.out.println("Invalid amount");
        }
    }
}
public class Interface {
    public static void main(String[] args) {
        RazorPay r1=new RazorPay();
        r1.calculateTotalAmount(10000);
    }
}

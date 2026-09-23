package Abstraction_Interface;
abstract class Payment{
    double amount;
    Payment(double amount){
        this.amount=amount;
    }
    public double calculateTax(){
        return amount*0.18;
    }
    abstract public double calculateFee();
    public double getFinalAmount(){
        return amount+calculateFee()+calculateTax();
    }
}
class UpiPayment extends  Payment{
    UpiPayment(double amount){
        super(amount);
    }
    @Override 
    public double calculateFee(){
        return super.amount*0.01;
    }
}
class CardPayment extends Payment{
    CardPayment(double amount){
        super(amount);
    }
    @Override 
    public double calculateFee(){
        return super.amount*0.02;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        UpiPayment up=new UpiPayment(10000);
        System.out.println("Amount "+up.amount+"\nTax "+up.calculateTax()+"\nFees "+up.calculateFee()+"\nFinal amount "+up.getFinalAmount());
        CardPayment cp=new CardPayment(10000);
        System.out.println("Amount "+cp.amount+"\nTax "+cp.calculateTax()+"\nFees "+cp.calculateFee()+"\nFinal amount "+cp.getFinalAmount());
    }
}

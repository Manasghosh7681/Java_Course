
package Abstraction_Interface;
// Parent interface
interface Payment {

    void makePayment();
}


// 1. Interface extends another interface
interface OnlinePayment extends Payment {

    void onlinePayment();
}


// Second independent interface
interface Refund {

    void processRefund();
}


// 2. Class implements TWO interfaces
class RazorPay implements Payment, Refund {

    @Override
    public void makePayment() {
        System.out.println("RazorPay payment");
    }

    @Override
    public void processRefund() {
        System.out.println("RazorPay refund");
    }
}


// Parent class
class Bank {

    public void openAccount() {
        System.out.println("Bank account opened");
    }
}


// 3. Class extends a class + implements an interface
class HDFCBank extends Bank implements Payment {

    @Override
    public void makePayment() {
        System.out.println("HDFC payment");
    }
}


// 4. Class extends a class + implements TWO interfaces
class ICICIBank extends Bank implements Payment, Refund {

    @Override
    public void makePayment() {
        System.out.println("ICICI payment");
    }

    @Override
    public void processRefund() {
        System.out.println("ICICI refund");
    }
}


// 5. Class implements an interface that itself extends another interface
class SBIOnlineBank extends Bank implements OnlinePayment {

    @Override
    public void makePayment() {
        System.out.println("SBI payment");
    }

    @Override
    public void onlinePayment() {
        System.out.println("SBI online payment");
    }
}


public class InterfaceClass {

    public static void main(String[] args) {

        RazorPay razorPay = new RazorPay();

        razorPay.makePayment();
        razorPay.processRefund();


        HDFCBank hdfc = new HDFCBank();

        hdfc.openAccount();
        hdfc.makePayment();


        ICICIBank icici = new ICICIBank();

        icici.openAccount();
        icici.makePayment();
        icici.processRefund();


        SBIOnlineBank sbi = new SBIOnlineBank();

        sbi.openAccount();
        sbi.makePayment();
        sbi.onlinePayment();
    }
}
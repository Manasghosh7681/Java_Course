package ThreadConcept;

class Resturant {
    public boolean OrderPrepared = false;

    synchronized public void makeOrder() {

        try {
            while (OrderPrepared) {
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " Cooking your meal");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Food is Ready");
            OrderPrepared = true;
            notifyAll();

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    synchronized public void deliverFood() {
        try {
            while (!OrderPrepared) {
                System.out.println(Thread.currentThread().getName() + " Order is not ready");
                wait();
            }
            System.out.println(Thread.currentThread().getName() + " Deliver Succesfully");
            OrderPrepared = false;
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}

class Customer extends Thread {
    Resturant r1;

    Customer(Resturant r1) {
        this.r1 = r1;
    }

    public void run() {
        r1.deliverFood();
    }
}

class Kitchen extends Thread {
    Resturant r1;

    Kitchen(Resturant r1) {
        this.r1 = r1;
    }

    public void run() {
        r1.makeOrder();
    }
}

public class InterThreadCommuni {
    public static void main(String[] args) {
        Resturant Zomato = new Resturant();

        /* All Kitchen Object */
        Kitchen justEat = new Kitchen(Zomato);
        justEat.setName("justEat");

        Kitchen udupi = new Kitchen(Zomato);
        udupi.setName("udupi");

        Kitchen jungleView = new Kitchen(Zomato);
        jungleView.setName("jungleView");

        Kitchen cloudKitchen = new Kitchen(Zomato);
        cloudKitchen.setName("cloudKitchen");

        /* All customer Object */
        Customer manas = new Customer(Zomato);
        manas.setName("manas");

        Customer abhi = new Customer(Zomato);
        abhi.setName("abhi");

        Customer asish = new Customer(Zomato);
        asish.setName("aasish");

        Customer anuradha = new Customer(Zomato);
        anuradha.setName("anuradha");

        justEat.start();
        udupi.start();
        jungleView.start();
        cloudKitchen.start();

        manas.start();
        abhi.start();
        asish.start();
        anuradha.start();
    }
}

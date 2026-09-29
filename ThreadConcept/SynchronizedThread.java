package ThreadConcept;

class BankAccount {
    public int amount = 3000;

    public void withdraw() {

        if (amount > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            amount -= 1000;
            System.out.println(Thread.currentThread().getName() + " Withdrarw success " + amount + " Available");
        } else {
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance");

        }

    }
}

class Operation extends Thread {
    BankAccount b1;

    public Operation(BankAccount b1) {
        this.b1 = b1;
    }

    public void run() {
        b1.withdraw();
    }
}

public class SynchronizedThread {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        Operation op = new Operation(b1);
        op.setName("1st");
        Operation op1 = new Operation(b1);
        op1.setName("2nd");
        Operation op2 = new Operation(b1);
        op2.setName("3rd");
        Operation op3 = new Operation(b1);
        op3.setName("4th");
        Operation op4 = new Operation(b1);
        op4.setName("5th");
        Operation op5 = new Operation(b1);
        op5.setName("6th");
        op.start();
        op1.start();
        op2.start();
        op3.start();
        op4.start();
        op5.start();
    }
}

/*
Without synchronized:

Multiple threads can enter the withdraw() method at the same time.
This may lead to a race condition because all threads are accessing
and modifying the same shared amount.

In this example, Thread.sleep() is added between checking the balance
and withdrawing the amount.

Suppose the amount is ₹3000.

Multiple threads can enter withdraw() and check:

    amount > 0

before any thread modifies the amount.

Therefore, multiple threads may see the available balance as ₹3000
and all satisfy the if condition.

After that, each thread subtracts ₹1000 from the balance.

This can cause the balance to become negative.


With synchronized:

Only one thread at a time can access the withdraw() method
for the same BankAccount object.

The first thread gets the lock, checks the balance, withdraws
₹1000, and releases the lock.

Then another thread gets the lock and checks the updated balance.

Initial amount = ₹3000

Thread 1 → ₹3000 → withdraw ₹1000 → ₹2000
Thread 2 → ₹2000 → withdraw ₹1000 → ₹1000
Thread 3 → ₹1000 → withdraw ₹1000 → ₹0
Thread 4 → ₹0 → Insufficient Balance
Thread 5 → ₹0 → Insufficient Balance
Thread 6 → ₹0 → Insufficient Balance

Therefore, only 3 threads can withdraw successfully.

The order of the threads is not fixed because it depends on
thread scheduling.
*/


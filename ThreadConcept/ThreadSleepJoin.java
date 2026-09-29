package ThreadConcept;

class Test extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if(Thread.currentThread().getName()=="Print  Thread"){

                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(getName() + " Finished");
        }
    }
}

public class ThreadSleepJoin {
    public static void main(String[] args) {
        try {
            Test t1 = new Test();
            t1.setName("Print  Thread");
            t1.start();
             Test t2=new Test();
            t2.start();;
            t1.join();

            //If we dont use join the main thread is complete 1st then t1 complete

           
            System.out.println("Main thread complete");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

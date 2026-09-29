package ThreadConcept;
class Task extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        Task t1=new Task();
        t1.start();
        // t1.start();   Illegal Thread Exception
        Task t2=new Task();
        t2.start();
    }
}

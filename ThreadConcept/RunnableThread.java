package ThreadConcept;
class Task implements Runnable{
    @Override 
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is created");
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        Task t1=new Task();
        Thread t2=new Thread(t1);
        t2.setName("First thread");
        Thread t3=new Thread(t1);
        t3.setName("2nd Thread");
        t2.start();
        t3.start();
    }
}

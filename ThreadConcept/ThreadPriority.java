package ThreadConcept;
class Task extends  Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Task t1=new Task();
        Task t2=new Task();
        Task t3=new Task();
        t1.setPriority(1);  //Min priority
        t2.setPriority(5);  //Norm Priority
        t3.setPriority(10); //Max priority
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}

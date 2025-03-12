
class MyThread1 extends Thread {
    public void run() {
        System.out.println("thread :"+" "+Thread.currentThread().getName()+" is running to print odd numbers");
        Thread.currentThread().setName("newThread2");
        // System.out.println("thread :"+" "+Thread.currentThread().getId()+" is running to print odd numbers");
        System.out.println("thread :"+" "+Thread.currentThread().getPriority()+" is running to print odd numbers");
        for (int i = 0; i < 10; i++) {
            if(i%2==1){
            System.out.println("odd numbers are :" + i);
            }
        }
    }
} 
class MyThread2 extends Thread {
    public void run() {
        System.out.println("thread :"+" "+Thread.currentThread().getName()+" is running to print even numbers");
        // System.out.println("thread :"+" "+Thread.currentThread().getId()+" is running to print even numbers");
        Thread.currentThread().setName("newThread1");
        System.out.println("thread :"+" "+Thread.currentThread().getPriority()+" is running to print even numbers");
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
            System.out.println("even numbers are :" + i);
            }
        }
    }
}
public class thread2 {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();
        m1.start();
        try{
            m1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        m2.start();
        
    }
}


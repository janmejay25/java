class Runnable1 implements Runnable{
    public void run(){
        for(int i = 0;i<=20;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
class Runnable2 implements Runnable{
    public void run(){
        for(int i = 0;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
public class thread {
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1();
        Runnable2 r2 = new Runnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
    
}

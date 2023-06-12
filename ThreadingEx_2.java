import java.lang.Runnable;

class A implements Runnable{
    public void Run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("A I = "+i);
        }
    }
}


public class ThreadingEx_2 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new A());
        t1.start();
    }

}

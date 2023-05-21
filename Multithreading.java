import java.lang.*;


class X extends Thread{
    public void run()
    {
        System.out.println("hello");
    }
}
public class Multithreading {
    public static void main(String[] args) {
        X x1=new X();
        x1.start();
    }

}


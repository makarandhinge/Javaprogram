import java.lang.Thread;

class X extends Thread{
    public void run()
    {
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("I = "+i);
        }

    }
}

class Y extends Thread{
    public void run(){
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println("Y = "+i);
        }
    }
}
public class ThreadingEX {
    public static void main(String[] args) {
        new X().start();
        new Y().start();
    }

}

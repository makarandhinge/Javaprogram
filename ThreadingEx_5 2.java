import java.lang.Thread;
public class ThreadingEx_5 {

    public static void main(String[] args) {
        Thread d = Thread.currentThread();
        int p = d.getPriority();
        System.out.println(p);
        d.setPriority(10);
        p = d.getPriority();
        System.out.println(p);
    }

}

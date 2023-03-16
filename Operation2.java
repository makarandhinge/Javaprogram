public class Operation2 {
    int data = 50;
    void change(int data)
    {
        data = data +100;

    }
    public static void main(String[] args) {
        Operation2 op = new Operation2();
        System.out.println("before change " + op.data);
        op.change(100);
        System.out.println("after change " + op.data);
    }
    
}

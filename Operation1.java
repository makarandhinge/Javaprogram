public class Operation1 {
    int data = 50;
    void change(Operation1 o)
    {
        o.data = o.data + 100;
    }
    public static void main(String[] args) {
        Operation1 op = new Operation1();
        System.out.println("before change " + op.data);
        op.change(op);
        System.out.println("after change " + op.data);
    }
}

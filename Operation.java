public class Operation {
    int data = 50;
    void change(int data)
    {
        this.data = data + 100;
    }
    public static void main(String[] args) {
    Operation op = new Operation();
    System.out.println("before change " + op.data);
    op.change(100);
    System.out.println("after change " + op.data);

    
    }
    
}

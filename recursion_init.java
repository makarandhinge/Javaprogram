class recursion_init
{
    public static void main(String[] args) {
        int a = 5;
        recursiveMethod(a);
    }
    static void recursiveMethod(int n)
    {
        if(n<1)
        {
            System.out.println("n is less than 1");
        }
        else{
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
}
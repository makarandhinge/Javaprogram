public class Recursive_iterative {
    public static void main(String[] args) {
        powerOfTwo(5);
        powerOfTwoIT(4);
    }
    static int powerOfTwo(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            var power = 2 * powerOfTwo(n-1);
            return power;
        }
    }
    static int powerOfTwoIT(int n)
    {
        var i = 0;
        var power = 1;
        while (i < n)
        {
            power = power * 2;
            i = i + 1;

        }
        return power;
    }
}

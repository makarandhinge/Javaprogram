class vararg
{
     int sumNumber(int ... args)
     {

         int sum = 0;
         for(int x: args)
         {
            sum = sum + x;
         }
         return sum;
      }
    public static void main( String[] args )
    {
        vararg obj = new vararg();
        System.out.println(obj.sumNumber(1, 2));
        System.out.println(obj.sumNumber(1, 2, 3));
        System.out.println(obj.sumNumber(1, 2, 3, 4));
    }
}


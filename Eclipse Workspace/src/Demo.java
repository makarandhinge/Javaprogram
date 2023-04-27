
import own_library.Addition;

class Demo {
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;
		Addition A = new Addition();
		int sum = A.add(a,b);
		System.out.println(sum);
	}

}

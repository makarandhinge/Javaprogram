/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AgeLimit
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner sc = new Scanner(System.in);
	int t,x,y,a;
	t = sc.nextInt();
	for(int i=0;i<t;i++)
	{
	    x = sc.nextInt();
	    y = sc.nextInt();
	    a = sc.nextInt();
	    
	    if(x<=a && a<y)
	    {
	        System.out.println("YES");
	    }
	    else
	    {
	        System.out.println("NO");
	    }
	    
	    
	}
	}
}

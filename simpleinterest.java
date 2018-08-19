import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		int res=p*t*r;
		if(res%100==0)
		{
			System.out.println(res/100);
		}
		else
		System.out.println(Math.floor(res));
	}
}

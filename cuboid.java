import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		int s=2*((l*w)+(w*h)+(h*l));
		int v=l*w*h;
		System.out.print(s+" ");
		System.out.print(v);
	}
}

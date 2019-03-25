package learning;

import java.util.Scanner;

public class ReverseStringNo {

	public static int reverse(int x)
	{
		int y =0;
		while(x!=0)
		{
			y= (y*10) + (x%10);
			x=x/10;
		}
		return y;
	}
	
	public static String reverse(String a)
	{	String b="";
		
		try {
			for(int i=a.length()-1 ;i>=0 ; i--)
			{
				b=b+a.charAt(i);
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Array Index Out of Bound! ");
		}
		return b;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse Function - ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Reverse: ");
		int x = sc.nextInt();
		System.out.println("Enter String to Reverse: ");
		String next = sc.next();
		int y= reverse(x);
		String b= reverse(next);
		System.out.println("Reversed Number: " + y);
		System.out.println("Reversed String: " + b);
		sc.close();
		

	}

}

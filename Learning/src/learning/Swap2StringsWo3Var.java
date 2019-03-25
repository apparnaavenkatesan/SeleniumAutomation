package learning;

import java.util.Scanner;

public class Swap2StringsWo3Var {

	public static void main(String[] args) {
		String a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swap-");
		a=sc.nextLine();
		System.out.println("String 1 :" + a);
		b=sc.nextLine();
		System.out.println("String 2 :" + b);
		System.out.println(a.length());
		System.out.println(b.length());
		a=a.concat(b);
		System.err.println(a);
		b=a.substring(0,(a.length() - b.length()));
		a=a.substring(b.length());
		System.out.println("After Swap-");
		System.out.println("String 1 :" + a);
		System.out.println("String 2 :" + b);
		

}
}

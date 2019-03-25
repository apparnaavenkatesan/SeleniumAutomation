package learning;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FiveDigitString {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");	
		String a = sc.nextLine();
		String match = "[\\d]{5}";
		boolean result = Pattern.matches(match, a);
		if (result == true)
			System.out.println("True!");
		else
			System.out.println("False!");
		sc.close();
			
				

	}

}

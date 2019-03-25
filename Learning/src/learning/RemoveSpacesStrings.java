package learning;

import java.util.Scanner;

public class RemoveSpacesStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");	
		String a = sc.nextLine();
		sc.close();
		a=a.replaceAll("\\s+", " "); // Replaces multiple spaces with single space
		a=a.replaceAll("\\s+$", ""); // Removes trailing spaces
		System.out.println(a);
		boolean matches = a.matches("^[^\\d].*"); //doesnt start with a digit check
		if(matches==true)
			System.out.println("Pass");
		else
			System.err.println("Fail");
		

	}

}

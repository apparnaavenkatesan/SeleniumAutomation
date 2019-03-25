package learning;

import java.util.Scanner;

public class Week1 {

	// ODD OR EVEN
	
	public void oddEven() 
	{
		Scanner a= new Scanner (System.in);
		System.out.println("Enter a number: ");
		int x = a.nextInt();
		if(x % 2 ==0)
		System.out.println(x + " Is an Even number");
		else
		System.out.println(x + " Is an odd Number");
		a.close();
		
	}
	
	// SECOND SMALLEST OF THREE NUMBERS
	
	public void smallest()
	{
		Scanner a= new Scanner (System.in);
		int x,y,z;
		System.out.println("Enter three Integers to compare - ");
		x= a.nextInt();
		y = a.nextInt();
		z = a.nextInt();
		if(x>y && x>z)
		{
			if(y>z)
				System.out.println(y + "is the second smallest no");
			else
				System.out.println(z + " is the second smallest no");
		}
		else if(y>x && y>z)
		{
			if(x>z)
				System.out.println(x + "is the second smallest no");
			else
				System.out.println(z + " is the second smallest no");
		}
		else if(z>x && z>y)
		{
			if(x>y)
				System.out.println(x + "is the second smallest no");
			else
				System.out.println(y + " is the second smallest no");
		}
		else
			System.out.println("Invalid Input");
		a.close();
	}
	
	
	//FIBONACCI SERIES
	
	
	public void fibonacci()   //NOT WORKING
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter limit: ");
		int max= 0;
		max = x.nextInt();
		x.close();
		int prev = 0;
		int next = 1;
		for (int i=1; i<=max; ++i)
		{
			System.out.println(prev + " ");
			int sum = prev + next;
			prev = next;
			next=sum;
			
		}
	}
	
	// MONTH AND DATE
	
	public void month()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Month and Year - ");
		int mon = a.nextInt();
		int year = a.nextInt();
		switch(mon)
		{
		case 1: 
		{
		System.out.println("January " + year + " : 31 days ");	
		break;
		}
		case 2:
		{
		if (year % 4 ==0)
		{
		System.out.println("February " + year + " : 29 days ");
		break;
		}
		else
		{
		System.out.println("February " + year + " : 28 days ");
		break;
		}
		}
		case 3:
		{
		System.out.println("March " + year + " : 31 days ");	
		break;
		}
		case 4:
		{
		System.out.println("April " + year + " : 30 days ");
		break;
		}
		case 5:
		{
		System.out.println("May " + year + " : 31 days ");
		break;
		}
		case 6:
		{
		System.out.println("June " + year + " : 30 days ");
		break;
		}
		case 7:
		{
		System.out.println("July " + year + " : 31 days ");	
		break;
		}
		case 8:
		{
		System.out.println("August " + year + " : 31 days ");
		break;
		}
		case 9:
		{
		System.out.println("September " + year + " : 30 days ");
		break;
		}
		case 10:
		{
		System.out.println("October " + year + " : 31 days ");
		break;
		}
		case 11:
		{
		System.out.println("November " + year + " : 30 days ");	
		break;
		}
		case 12:
		{
		System.out.println("December " + year + " : 31 days ");	
		break;
		}
		}
		a.close();
	}
	
	// SUM OF NUMBERS IN AN ARRAY
	
	public void sumArray ()
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter array limit: ");
		int x = a.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter Values in the Array : ");
		int sum = 0;
		for (int n=0; n<x; n++)
		{
			arr[n]=a.nextInt();
			sum+=arr[n];
		}
		System.out.println("The Array entered is : ");
		for (int b=0; b<x; b++)
		{
			System.out.print(arr[b] + "  ");
		}
		System.out.println();
		System.out.println("Sum of the numbers Entered: " + sum);
		a.close();
	}
	
	
	
}

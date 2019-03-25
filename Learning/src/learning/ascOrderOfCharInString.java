package learning;
import java.util.Scanner;
import java.util.TreeSet;

public class ascOrderOfCharInString {

		/*public static void main(String[] args) {
			System.out.println("Enter a the number: ");
			Scanner ip = new Scanner(System.in);
			String ipvalue = ip.next();
			TreeSet<Character> set = new TreeSet<Character>();
			for (Character eachcharacter : ipvalue.toCharArray()) {
				set.add(eachcharacter);
			}
			String temp = "";
			for (Character ch : set) {
				temp=temp+ch.toString();				
			}
			System.out.println("input= "+ipvalue);
			System.out.println("output= "+temp);			
		ip.close();
		}*/

	
	public static void main(String[] args) {
		System.out.println("Enter a the number: ");
		Scanner sc = new Scanner(System.in);
		int ipvalue = sc.nextInt();
		sc.close();
		int arr[]= {}; 
		int i =0;
		while(ipvalue>0)
		{
			int lastdgt = ipvalue%10;
			arr[i] = lastdgt;
			ipvalue = ipvalue/10;
			i++;
		}
		int length = arr.length;
		int temp =0;
		for(int x=0; x<length; x++)
		{
			if(arr[x]>arr[x+1])
			{
				temp=arr[x+1];
				arr[x+1]=arr[x];
				arr[x]=temp;
			}
			else
			continue;
		}
			
		
			
	}
	}
	

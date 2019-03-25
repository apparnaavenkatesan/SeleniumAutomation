package learning;

public class StaticNonStatic {

	static String word1 = "hello";
	String word2 = "world";
	
	public static void printStatic(StaticNonStatic obj)
	{
		System.out.println(word1 );
		System.out.println(obj.word2);
	}
	
	public void printNonstatic()
	{
		System.out.println(word1);
		System.out.println(word2);
	}
	
	public static void main(String[] args) 
	{
	StaticNonStatic obj = new StaticNonStatic();
	printStatic(obj);
	obj.printNonstatic();

	}

}

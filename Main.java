public class Main
{
	public static void main(String[] args) 
	{
	System.out.println("Concatenation");
	String s = "Jess" + 1 + 2 + "\n";
	System.out.print(s);
	String j = "Australia" + 1 + (4 + 2) * 10;
	System.out.println(j);
	
	Test x; //declares x as Test 
	x = new Test(); //initializes x as an object of Test class
	System.out.println(x.toString());
	
	String s1 = new String("White bowl");  
	s1 = "New White bowl"; //changed s1 from White bowl to New White bowl
	//s1 has a length of 10 characters (starts from 0)
	System.out.println("Our word: \"New White bowl\"\n# of characters:");
	System.out.println(s1.length());
	
	String s2 = s1.substring(4);
	String s3 = s1.substring(11,14); 
	//s3 uses a method with 2 int parameters
	//first int = inclusive, second int = exclusive
	System.out.println(s2);
    System.out.println(s3);
	}
	
	
}







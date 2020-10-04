public class Main
{
	public static void main(String[] args) 
	{
	System.out.println("__Concatenation__");
	String s = "Jess" + 1 + 2 + "\n";
	System.out.print(s);
	String j = "Australia" + 1 + (4 + 2) * 10;
	System.out.println(j);
	
	System.out.println("__toString method__");
	Test x; //declares x as Test 
	x = new Test(); //initializes x as an object of Test class
	System.out.println(x.toString());
	
	System.out.println("__Escape squences plus .length method__");
	String s1 = new String("White bowl");  
	s1 = "New White bowl"; //changed s1 from White bowl to New White bowl
	//s1 has a length of 14 characters (starts from 0) (includes spaces)
	System.out.println("\\Our word: \"New White bowl\"\n# of characters:");
	System.out.println(s1.length());
	
	System.out.println("__.substring method__");
	String s2 = s1.substring(4);
	String s3 = s1.substring(11,14); 
	//s3 uses a method with 2 int parameters
	//first int = inclusive, second int = exclusive
	System.out.println(s2);
    System.out.println(s3);
    
    System.out.println("__.indexOf method with a String parameter__");
    System.out.println("In \"New White bowl\", what is the index of the character, \"W\"?");
    System.out.println(s1.indexOf("W")); 
    System.out.println("How about \"bowl\"?");
    System.out.println(s1.indexOf("bowl"));
    //if ask for a character/word that is not in s1, then -1 prints out.
    System.out.println("There is a \"w\" at index 2 and 12.\nIf we want to find the \"w\" at index 12, make computer start searching for it at index 3 and above!");
    System.out.println(s1.indexOf("w",3));
    
    System.out.println("__.equals method and .compareTo method__"); 
    //equals method returns a boolean (true or false)

    String f1 = "Who drank the milk?";
    String f2 = "I drank the milk!";
    String f3 = "I drank the milk!";
    String f4 = "She drank the milk!";
    String f5 = "He drank the milk!";
    System.out.println(f2.equals(f3));
    System.out.println(f1.equals(f4));
    
    System.out.println(f1.compareTo(f5));
    //f5's H is 15 spaces in front of f1's W in the ASCII alphabet
    System.out.println(f5.compareTo(f1));
    //f1's W is 15 spaces behind f5's H in the ASCII alphabet
    System.out.println(f2.compareTo(f3));
    //no spaces from each other-both start with the same letter: I
	}
	
}







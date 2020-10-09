public class Main
{
	public static void main(String[] args) 
	{
	    System.out.println("Purpose of wrapper class");
        Integer iPhone8J = new Integer(5);
        Integer iPhone8D = new Integer(5);
        Integer iPhone8A = new Integer(1);
        Integer iPhone8H = iPhone8J; 
        boolean samePhone;
        samePhone = (iPhone8J == iPhone8D);
        System.out.println(samePhone);
        
        //(iPhone8J == iPhone8D) returns false because the two objects are not the same, even with same contents
        //(iPhone8H == iPhone8J) returns true because one object is referring to the SAME object
        //iPhone8J.equals(iPhone8D) returns true, though, because the equals method checks for the contents of the object
        
        System.out.println(iPhone8J.MIN_VALUE); //prints lowest possible value of an int: -2147483648
        System.out.println(iPhone8A.MAX_VALUE); //prints highest possible value of an int 2147483648
        
        System.out.println("__intValue__");
        //both are ints, not objects, both ARE 4, NOT EQUAL 4
        //so (a==b) is true, since both are not objects, cannot use a.equals(b) [object reference]
        Integer i1 = new Integer(4);
        Integer i2 = new Integer(4);
        int a = i1.intValue();
        int b = i2.intValue();

        System.out.println("__Math.abs and Math.pow method__");
        System.out.println(Math.abs(-3.14));
        System.out.println(Math.abs(6)); 
        //both prints absolute value 

        System.out.println(Math.pow(3, 4)); 
        //bascially 3 to the power of 4
        //Math.pow method always takes in two double variables as parameters
        //if pass in an int or two ints, both are automatically converted to a double
        //answer will be a double
        
        System.out.println("__Math.sqrt method__");
        //Math.sqrt(a) returns a DOUBLE that is the square root of a
        System.out.println(Math.sqrt(25));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.sqrt(26.9));
        System.out.println(Math.sqrt(-26.9)); 
        //return NaN because Java does not do imaginary numbers[cannot square root neg numbers]
        
        System.out.println("__Let's try what we've just learned!__");
        double t = -25;
        System.out.print(Math.sqrt(Math.abs(t))); 
        if(t < 0)
            System.out.println("i");
        //absolute value of -25, square root 25 = 5
        //t is negative/less than zero 
        //in real life, square root of -25 is 5i but Java will not print the imaginary number so do manually
        //if t is negative/less than zero, that means in real life, the answer would ACTUALLY be 5i
        //therefore, print the i after the answer of the calculation
        
        System.out.println("__Math.random method__");
        int diceNumber;
        //to generate random numbers from 0 to 1 (unless adjusted like below)
        diceNumber = ((int)(Math.random()*6) + 1);
        System.out.println(diceNumber);
        //generate random double from 0 to 1, multiple by 6 to make double from 0 to 6
        //cast to an int because dice side does not gave decimals, making it from 0 to 5 inclusive
        //0 to 5 because double was giving 5.99999 not exactly 6 so when cast to int, truncates to 5
        //then add 1 to make it becomes int 1 to 6 inclusive
        //this is for 6-sided dice
	}
}

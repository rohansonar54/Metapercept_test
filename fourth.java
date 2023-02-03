package metape;
/*
 * Create a class that accepts two numbers. Create another class that fetches the
 *  last digit of those two numbers. Create a third class that multiplayer that last two digits.
Example: Class A: Accept two numbers.
		    Class B: Fetches the last digits of the numbers
		    Class C: Multiplay the last two digits.

 */

 class input
{
	private int num1=123;
	private int num2=234;
	
	public input(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	
	public int getNum1()
	{
		return num1;
	}
	public int getNum2()
	{
		return num2;
	}
}

 class ClassB
 {
	 private int lastDigit1;
	 private int lastDigit2;
	 
	 public ClassB(input input)
	 {
		 this.lastDigit1=input.getNum1()%10;
		 this.lastDigit2=input.getNum2()%10;
	 }
	 
	 public int getLastDigit1()
	 {
		 return lastDigit1;
	 }
	 public int getLastDigit2()
	 {
		 return lastDigit2;
	 }
 }
 
 
  class ClassC
 {
	 
	 private int product;
	 
	 public ClassC(ClassB lastdigits)
	 {
		 
		 this.product=lastdigits.getLastDigit1()*lastdigits.getLastDigit2();
		 
	 }
	 
	 public int getProduct()
	 {
		 return product;
	 }
 }

public class fourth {
public static void main(String[] args) {
	
	input classA=new input(123,456);
	
	ClassB classB= new ClassB(classA);
	
	ClassC classC= new ClassC(classB);
	
	System.out.println("product of last digit no is = "+ classC.getProduct());
	
	
	
}
	
}

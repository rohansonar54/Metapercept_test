package metape;

public class first {
/*
 * Create a function to return the longest word in a string.
Input: “dummy text of the printing and typesetting industry.”
Output: typesetting 
Input: “It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English”
Output: distributionqqqqqqqqqqqqqqqqqqq 

 */
	
	public static String longest(String text)
	{
		String [] words=text.split("\\s+");
		int maxLength=0;
		
		String max="";
		
		for(String word: words)
		{
			if(word.length()>maxLength)
			{
			maxLength=word.length();
			max=word;
			}
		}
		
		
		
		return max;
	}
	public static void main(String[] args) {
		
		String s="dummy text of the printing and typesetting industry.";
		
		System.out.println(longest(s));;
	}

}

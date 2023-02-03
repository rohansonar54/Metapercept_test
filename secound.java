package metape;

public class secound {

	/*
	 * Find the maximum number in a jagged array of numbers or array of numbers.
		Input: [2, 4, 10, [12, 4, [100, 99], 4], [3, 2, 99], 0]

	 */

	 public static int findMax(Object[] a)
	 {
		 int max=Integer.MIN_VALUE;
			for(Object o: a)
			{
				if(o instanceof Integer)
				{
					max=Math.max(max,(int)o);
				}
				else
					if(o instanceof Object[])
					{
						max=Math.max(max,findMax((Object[])o));
					}
			}
			return max;
		 
		 
	 }
	public static void main(String[] args) {
		
				Object[] arr =new Object[] {2, 4, 10, new Object[] {12, 4, new Object[]{100, 99}, 4},new Object[] {3, 2, 99}, 0};
		
		
		
		System.out.println("maximum no is:" +findMax(arr));
		
		
		
	}
}

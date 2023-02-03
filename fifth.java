package metape;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;;

public class fifth {
/*
 * Write a program that accepts an email string and validates that email.
 *  If email is valid must display success message and If email is not valid must
 *   display error message
 *   
Example:  Input - test01*gmail.com
	     Output - Invalid Email Id
	     Input - student01@gmail.com
	     Output - Valid Email Id

 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email id: ");
		String s=sc.next();
		char ch2[]=s.toCharArray();
		
		String s2="!#$%^&*():;/*-+~<>?!";
		int cnt=0;
		char ch[]=s2.toCharArray();
		
		for(int i=0;i<ch2.length;i++)
		{
			cnt=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch2[i]==ch[j])
				{
					cnt++;
				}
			}
			
		}
		
		if(cnt==0)
		{
		System.out.println("Enter valid mail ID");
		}
		else
		{
			System.out.println("Valid ");
		}
		
		
		
		
		
		
		
		
		
	}

}

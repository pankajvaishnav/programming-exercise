package org.btm.programmingApp;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		String s = sc.next();
		sc.close();
		boolean rs = isPalindrome(s);
		if(rs)
		{
			System.out.println(s+" is Palindrome Number");
		}
	}

	private static boolean isPalindrome(String s) 
	{
		for(int i=0;i<s.length();i++)
		{
			if(!(s.charAt(i)==s.charAt(s.length()-1-i)))
			{
				System.out.println("Not Palindrome");
				break;
			}
		}
		return true;
	}

	
	
	/*private static boolean isPalindrome(String s) 
	{
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			if(!(ch[i]==ch[ch.length-i-1]))
			{
				System.out.println("Not Palindrome");
				break;
			}
		}
		return true;
	}*/
}

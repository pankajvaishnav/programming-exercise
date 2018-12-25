package org.btm.programmingApp;
import java.util.Scanner;
public class Panagram3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		sc.close();
		boolean rs = isPanagram(s);
		if(rs)
			System.out.println("String is Panagram");
		else
			System.out.println("String is not Panagram");
	}

	private static boolean isPanagram(String s) 
	{
		char[] ch1 = new char[26];
 		char ch='a';
		for(int i=0;i<26;i++)
		{
			ch1[i]=ch;
			ch++;
		}
		
		for(int i=0;i<ch1.length;i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++) 
			{
				if(ch1[i]==s.charAt(j))
				{
					count++;
					break;
				}
			}
			if(count==0)
				return false;
		}
		return true;
	}
}

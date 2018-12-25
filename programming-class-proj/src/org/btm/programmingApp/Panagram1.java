package org.btm.programmingApp;
import java.util.Scanner;
public class Panagram1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		sc.close();
		boolean rs = isPanagram(s);
		if(rs)
			System.out.println("Panagram");
		else
			System.out.println("Not Panagram");
	}

	private static boolean isPanagram(String s) 
	{
		int ar[] = new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ar[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				ar[ch-97]++;
			}
		}
		for(int i=0;i<26;i++)
		{
			if(ar[i]==0)
				return false;
		}
		return true;
	}
}

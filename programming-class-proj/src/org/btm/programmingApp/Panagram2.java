package org.btm.programmingApp;
import java.util.Scanner;
public class Panagram2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s= sc.nextLine();
		sc.close();
		boolean rs = isPanagram(s);
		if(rs)
			System.out.println("String is Panagram");
		else 
			System.out.println("Not Panagram");
	}

	private static boolean isPanagram(String s) 
	{
		int [] ar = new int[26];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				ar[s.charAt(i)-97]++;
			}
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				ar[s.charAt(i)-65]++;
			}
		}
		boolean b=true;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==0)
				b=false;
		}
		return b;
	}
}

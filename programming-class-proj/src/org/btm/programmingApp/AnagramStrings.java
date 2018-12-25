package org.btm.programmingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class AnagramStrings 
{
	static ArrayList<String> al = new ArrayList<String>();
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		
		boolean rs = isAnagram(s1,s2);
		if(rs)
			System.out.println("Strings Are Anagram");
		else
			System.out.println("Strings Are Not Anagram");
		sc.close();
	}

	private static boolean isAnagram(String s1, String s2) 
	{
		if(s1.length()!=s2.length())
			return false;
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i=0;i<ch1.length;i++)
		{
			list1.add(ch1[i]+"");
			list2.add(ch2[i]+"");
		}
 		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(list1.get(i).equalsIgnoreCase(list2.get(i)))
				{
					al.add(ch1[i]+"");
					break;
				}
			}
		}
		System.out.println(al);
		return ch1.length==al.size();
	}
}

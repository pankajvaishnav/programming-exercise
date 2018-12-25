package org.btm.programmingApp;
import java.util.Scanner;
public class AnagramWithoutCollection
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String: ");
		String s2 = sc.nextLine();
		sc.close();
		boolean rs = isAnagram(s1,s2);
		if(rs)
			System.out.println("Strings Are Anagram");
		else
			System.out.println("Strings Are Not Anagram");
	}

	private static boolean isAnagram(String s1, String s2) 
	{
		if(s1.length()!=s2.length())
			return false;
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		s1="";
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]>='A'&&ch1[i]<='Z')
			{
				ch1[i]=(char) ((int)ch1[i]+32);
			}
			if(ch2[i]>='A'&&ch2[i]<='Z')
			{
				ch2[i]=(char) ((int)ch2[i]+32);
			}
			boolean b=true;
			for(int j=0;j<ch1.length;j++)
			{
				char ch=0;
				if(ch1[i]<ch1[j])
				{
					ch=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=ch;
				}
				if(ch2[i]<ch2[j])
				{
					ch=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=ch;
				}
				
				if(ch1[j]!=ch2[j])
					b = false;
			}
			if(b)
				return b;
		}
		return false;
	}
}



/*private static boolean isAnagram(String s1, String s2) 
{
	if(s1.length()!=s2.length())
			return false;
	int ar[] = new int[26];
	int ar1[] = new int[26];
	for(int i=0;i<s1.length();i++)
	{
		char ch = s1.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			ar[ch-65]++;
		}
		else if(ch>='a'&&ch<='z')
		{
			ar[ch-97]++;
		}
	}
	for(int i=0;i<s2.length();i++)
	{
		char ch = s2.charAt(i);
		if(ch>='A'&&ch<='Z')
		{
			ar1[ch-65]++;
		}
		else if(ch>='a'&&ch<='z')
		{
			ar1[ch-97]++;
		}
	}
	for(int i=0;i<26;i++)
	{
		if(ar1[i]!=ar[i])
			return false;
	}
	return true;
}*/
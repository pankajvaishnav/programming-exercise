package org.btm.programmingApp;
public class Anagram2 
{
	public static void main(String[] args) 
	{
		String s1="silent";
		String s2="listen";
		
		boolean rs=isAnagram(s1,s2);
		if(rs)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

	private static boolean isAnagram(String s1, String s2) 
	{
		if(s1.length()!=s2.length())
			return false;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				if(ch1[i]<ch1[j])
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
				if(ch2[i]<ch2[j])
				{
					char temp=ch2[i];
					ch2[i]=ch2[j];
					ch2[j]=temp;
				}
			}
		}
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
				return false;
		}
		return true;
	}
}

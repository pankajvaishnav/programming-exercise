package org.btm.programmingApp;
public class SubString2
{
	public static void main(String[] args) 
	{
		String s = "XYYXYXY";
		long n = getSubStrings(s);
		System.out.println(n);
	}

	private static long getSubStrings(String s) 
	{
		long count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='X')
			{
				count++;
			}
		}
		
		return count*(count+1)/2;
	}
}
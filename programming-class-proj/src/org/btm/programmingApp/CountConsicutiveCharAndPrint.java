package org.btm.programmingApp;
public class CountConsicutiveCharAndPrint 
{
	public static void main(String[] args) 
	{
		String s = "aaassseeggffsssssss";
		String rs=consChar(s);
		System.out.println(rs);
	}

	private static String consChar(String s) 
	{
		String st="";
		boolean b=false;
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i;j<s.length();j++)
			{
				if(j==s.length()-1)
				{
					b=true;
				}
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				else
				{
					i=j-1;
					break;
				}
			}
			st=st+s.charAt(i)+count;
			if(b)
				break;
		}
		return st;
	}
}

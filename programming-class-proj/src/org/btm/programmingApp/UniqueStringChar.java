package org.btm.programmingApp;
public class UniqueStringChar
{
	public static int isUnique(String  s)
	{
		int count=0;
		for (int i = 0; i < s.length(); i++)
		{
			boolean b = true;
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					b=false;
					break;
				}
			}
			if(b)
			{
				count++;
				System.out.print(s.charAt(i)+" ");
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		String s = "aaabbccccdefff";
		System.out.println("\n"+isUnique(s));
	}
}

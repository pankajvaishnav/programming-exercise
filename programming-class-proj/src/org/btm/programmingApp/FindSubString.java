package org.btm.programmingApp;
public class FindSubString 
{
	public static void main(String[] args) 
	{
		String s = "this is a string";
		String st = "string";
		int j=6;
		for(int i=0;i<=s.length()-6;i++)
		{
				if(!(s.substring(i, j).equals(st)))
				{
					System.out.println(s.substring(i,j));
				}
				j++;
		}
		//System.out.println(s.substring(0, 6));
	}
}
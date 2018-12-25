package org.btm.programmingApp;
import java.util.Scanner;
public class Panagram4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		sc.close();
		boolean rs=isPanagram(s);
		if(rs)
			System.out.println("Panagram");
		else
			System.out.println("Not Panagram");
	}
	private static boolean isPanagram(String s) 
	{
		String st=s.toLowerCase();
		for(char ch='a';ch<='z';ch++)
		{
			if(!(st.contains(""+ch)))
					return false;
		}
		return true;
	}
}

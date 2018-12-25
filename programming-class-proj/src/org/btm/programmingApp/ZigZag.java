package org.btm.programmingApp;

import java.util.Scanner;

public class ZigZag 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = s.next();
		System.out.println("Enter Second String: ");
		String s2 = s.next();
		s.close();
		String rs = doZigZag(s1,s2);
		System.out.println(rs);
	}

	private static String doZigZag(String s1, String s2) 
	{
		String st = "";
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int j=0,k=0;
		for(int i=0;i<ch1.length+ch2.length;i++)
		{
			
			if(i%2==0&&j<=ch1.length-1)
			{
				st=st+ch1[j];
				j++;
			}
			else if(i%2!=0&&k<=ch2.length)
			{
				st=st+ch2[k];
				k++;
			}
			
		}
		return st;
	}
}

package org.btm.programmingApp;

import java.util.Scanner;

public class AlphaNumericSumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text:");
		String st = sc.next();
		sc.close();
		int sum = getSum(st);
		System.out.println(sum); 	
	}

	private static int getSum(String st) 
	{
		int sum=0;
		char[] ch = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			//System.out.print(ch[i]);
			if(ch[i]>='0'&&ch[i]<='9')
			{
				sum=sum+ch[i]-48;
			}
		}
		return sum;
	}
}

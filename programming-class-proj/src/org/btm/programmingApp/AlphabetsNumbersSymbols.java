package org.btm.programmingApp;

import java.util.Scanner;

public class AlphabetsNumbersSymbols 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'alphabets' or 'characters' for lowercare alphabets");
		System.out.println("Enter 'ALPHABETS' or 'CHARACTERS' for uppercase alphabets");
		System.out.println("Enter 'numbers' or 'digits' for digits");
		System.out.println("Enter 'symbols' for symbols: \n");
		String st = sc.next();
		sc.close();
		if(st.equals("alphabets")||st.equals("characters"))
		{
			for(char ch='a';ch<='z';ch++)
			{
				System.out.print(ch+" ");
			}
		}
		else if(st.equals("ALPHABETS")||st.equals("CHARACTERS"))
		{
			for(char ch='A';ch<='Z';ch++)
			{
				System.out.print(ch+" ");
			}
		}
		else if(st.equalsIgnoreCase("numbers")||st.equalsIgnoreCase("digits"))
		{
			for(int i=0;i<=9;i++)
			{
				System.out.print(i+" ");
			}
		}
		else if(st.equalsIgnoreCase("symbols"))
		{
			for(int i=32;i<=64;i++)
			{
				if(!(i>=48&&i<=57))
					System.out.print((char)i+" ");
			}
		}
		else
			System.out.println("Wrong Input!!!");
	}
}

package org.btm.programmingApp;

import java.util.Scanner;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n = sc.nextInt();
		sc.close();
		if(n%2==0)
		{
			System.out.println(n+" Is Even Number");
		}
		else 
		{
			System.out.println(n+" Is Odd Number");
		}
	}
}

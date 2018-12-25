package org.btm.programmingApp;

import java.util.Scanner;

public class PositiveNegative 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		Integer n = sc.nextInt();
		sc.close();
		if(n>=0)
		{
			System.out.println("Positive Number");
		}
		else if(n<0)
		{
			System.out.println("Negative Number");
		}
	}
}

package org.btm.programmingApp;
import java.util.Scanner;
public class SpecialNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Two Digit Number: ");
		int n = sc.nextInt();
		sc.close();
		
		boolean spn = isSpecialNumber(n);
		
		if(spn)
		{
			System.out.println(n+" is Special Number");
		}
		else
		{
			System.out.println(n+" is Not Special Number");
		}
	}

	private static boolean isSpecialNumber(int n) 
	{
		int x = n%10;
		int y = n/10;
		
		if((x+y)+(x*y)==n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

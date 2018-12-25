package org.btm.programmingApp;
import java.util.Scanner;
public class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n =  sc.nextInt();
		sc.close();
		
		boolean b = isStrong(n);
		if(b)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");
	}

	private static boolean isStrong(int n) 
	{
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int mod=n%10;
			sum+=fact(mod);
			n/=10;
		}
		return temp==sum;
	}

	private static int fact(int mod) 
	{
		int fact=1;
		for(int i=1;i<=mod;i++)
		{
			fact*=i;
		}
		return fact;
	}
}

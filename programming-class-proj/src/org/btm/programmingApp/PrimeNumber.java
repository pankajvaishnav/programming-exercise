package org.btm.programmingApp;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int n = sc.nextInt();
		sc.close();
		for(int i=2;i<=n;i++)
		{
			isPrime(i);
		}
	}

	private static void isPrime(int n) 
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(n+" is Prime");
	}
}

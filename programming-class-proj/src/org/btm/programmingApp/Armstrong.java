package org.btm.programmingApp;
import java.util.Scanner;
public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n = sc.nextInt();
		sc.close();
		boolean b = isArmstrong(n);
		if(b)
		{
			System.out.println(n+" is Armstrong");
		}
		else
			System.out.println(n+" is Not Armstrong");
	}

	private static boolean isArmstrong(int n) 
	{
		String s = "";
		s+=n;
		int temp=n;
		int sum = 0;
		
		while(n!=0)
		{
			int mod = n%10;
			sum=sum+pow(s.length(),mod);
			n=n/10;
		}
		return sum==temp;
	}

	private static int pow(int length, int mod) 
	{
		int pw=1;
		while(length>0)
		{
			pw*=mod;
			length--;
		}
		return pw;
	}
}

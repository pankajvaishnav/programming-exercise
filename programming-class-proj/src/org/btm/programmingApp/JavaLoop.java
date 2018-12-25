package org.btm.programmingApp;
import java.util.Scanner;
public class JavaLoop 
{
	public static void main(String[] args) 
	{
		//System.out.println(Byte.MIN_VALUE);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			int sum=a;
			//System.out.print(sum+" "+a+" "+b+" "+n);
			//System.out.println();
			for(int j=0;j<n;j++)
			{
				
				sum+=pow(j)*b;
				System.out.print(sum+" ");
			}
		}
		sc.close();
	}

	private static int pow(int j) 
	{
		int pw=1;
		while(j>0)
		{
			pw=pw*2;
			j--;
		}
		return pw;
	}
}

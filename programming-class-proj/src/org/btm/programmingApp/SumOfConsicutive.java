package org.btm.programmingApp;
import java.util.Scanner;
public class SumOfConsicutive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		sc.close();
		
		getResult(n);
	}

	private static void getResult(int n) 
	{
		
		int x = (n+1)/2;
		for(int i=1;i<=x;i++)
		{
			int sum=0;
			String st="";
			for(int j=i;j<=x;j++)
			{
				st=st+j+" ";
				sum+=j;
				if(sum==n)
				{
					System.out.println(st);
					break;
				}
				if(sum>n)
					break;
			}
			//System.out.println();
		}
	}
}
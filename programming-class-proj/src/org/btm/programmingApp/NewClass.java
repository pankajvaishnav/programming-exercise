package org.btm.programmingApp;
import java.util.Scanner;
public class NewClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int n=sc.nextInt();
		sc.close();
		getResult(n);
	}

	private static void getResult(int n) 
	{
		int x=n+1,y=n+n;
		for(int i=1;i<=n*n;i++)
		{
			if(!(i>=x&&i<=y))
			{
				if(i%n!=0)
				{
					System.out.print(i+"*");
				}
				else
					System.out.println(i);
			}
		}
		for(int i=x;i<=y;i++)
		{
			if(i%n!=0)
			{
				System.out.print(i+"*");
			}
			else
				System.out.print(i);
		}
	}
}

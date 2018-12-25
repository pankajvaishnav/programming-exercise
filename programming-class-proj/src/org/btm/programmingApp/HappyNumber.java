package org.btm.programmingApp;
import java.util.Scanner;
public class HappyNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n3=sc.nextInt();
		sc.close();
		isHappyNum(n3);
	}
	private static void isHappyNum(int n3) 
	{
		int sum=0;
		while(n3>0)
		{
			int mod=n3%10;
			sum+=pow(mod);
			n3=n3/10;
		}
		if(sum>9)
		{
			n3=sum;
			isHappyNum(n3);
		}
		else
		{
			if(sum==1||sum==7)
				System.out.println("Happy Number");
			else
				System.out.println("Not Happy Number");
		}
	}
	private static int pow(int mod) 
	{
		int pw=1,i=2;
		while(i>0)
		{
			pw*=mod;
			i--;
		}
		return pw;
	}

}

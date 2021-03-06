package org.btm.programmingApp;
public class ArmstrongBetweenARange 
{
	public static void main(String[] args) 
	{
		boolean b = false;
		for(int i=1;i<=1000;i++)
		{
			b = isArmstrong(i);
			if(b)
			{
				System.out.print(i+" ");
			}
		}
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

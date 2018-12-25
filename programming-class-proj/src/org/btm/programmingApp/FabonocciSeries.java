package org.btm.programmingApp;
public class FabonocciSeries 
{
	static int n=10;
	public static void main(String[] args) 
	{
		int a=0,b=1;
		//int n=50;
		
		fabonocci(a,b);
	}

	private static void fabonocci(int a, int b) 
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a+b);
			a=a+b;
			b=a-b;	
		}
	}
}

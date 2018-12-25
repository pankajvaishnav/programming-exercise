package org.btm.programmingApp;

public class MyThread extends Thread
{
	public static void main(String[] args) 
	{
		int ar[] = new int[100000];
		int k=0;
		for(int i=1;i<=100000;i++)
		{
			ar[k]=i;
			k++;
		}
		for(int i=0;i<100000;i++)
		{
			System.out.println(ar[i]);
		}
	}
}

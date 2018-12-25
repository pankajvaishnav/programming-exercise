package org.btm.programmingApp;
public class ShiftArrayElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		int[] ar = {4,3,6,2,4,7,5,8,4,9};
		int k=0;
		for(int i=3;i<ar.length+3;i++)
		{
			if(i>=ar.length)
			{
				i=i-ar.length;
			}
			System.out.print(ar[i]+" ");
			k++;
			Thread.sleep(1000);
			if(k==ar.length)
				break;
		}
	}
}

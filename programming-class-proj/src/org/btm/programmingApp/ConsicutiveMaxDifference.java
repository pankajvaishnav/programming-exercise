package org.btm.programmingApp;
public class ConsicutiveMaxDifference 
{
	static int[] ar = {12,13,14,15,12,13,17,12,19,20,14};
	public static void main(String[] args) 
	{
		int temp=0;
		int max = 0;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]>ar[i+1])
				temp=ar[i]-ar[i+1];
			else
				temp=ar[i+1]-ar[i];
			//temp=Math.abs(ar[i]-ar[i+1]);
			if(temp>max)
				max=temp;
			
		}
		System.out.println("Maximum Difference: "+max);
	}
}

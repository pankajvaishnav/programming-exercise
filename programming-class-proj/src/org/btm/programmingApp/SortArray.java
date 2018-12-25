package org.btm.programmingApp;
public class SortArray 
{
	
	public static void main(String[] args) 
	{
		int ar[] = {3,2,44,7,5,9,6};
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length;j++)
			{
				
				if(ar[j]>ar[i])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("\nMaximum diffrence: "+(ar[ar.length-1]-ar[0]));
	}
}

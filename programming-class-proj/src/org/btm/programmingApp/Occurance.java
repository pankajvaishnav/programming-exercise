package org.btm.programmingApp;
public class Occurance 
{
	static int[] ar = {12,13,14,15,12,13,17,12,19,20,14};
	public static void main(String[] args) 
	{
		for(int k=0;k<ar.length;k++)
		{
			for(int l=0;l<ar.length;l++)
			{
				if(ar[l]>ar[k])
				{
					int temp=ar[k];
					ar[k]=ar[l];
					ar[l]=temp;
				}
			}
		}
		
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			if(i<ar.length-1)
			{
				if(ar[i]!=ar[i+1])
				{
					System.out.println(ar[i]+"-->"+count);
					
				}
			}
			else
				System.out.println(ar[i]+"-->"+count);
		}
	
	}

}

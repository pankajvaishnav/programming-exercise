package org.btm.programmingApp;
public class PutAllZerosAtLast 
{
	public static void main(String[] args) 
	{
		int[] ar = {4,0,2,0,3,0,0,5,1,19};
		int[] newAr = new int[ar.length];
		int k=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				newAr[k]=ar[i];
				k++;
			}
		}
		for(int i=newAr.length;i<ar.length;i++)
		{
			newAr[i]=0;
		}
		for(int i=0;i<newAr.length;i++)
		{
			System.out.print(newAr[i]+" ");
		}
	}
}

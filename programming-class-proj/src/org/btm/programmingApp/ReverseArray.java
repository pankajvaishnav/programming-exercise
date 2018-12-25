package org.btm.programmingApp;
public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[] ar = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<ar.length/2;i++)
		{
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
}

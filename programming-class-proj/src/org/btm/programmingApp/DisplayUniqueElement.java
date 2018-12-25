package org.btm.programmingApp;
public class DisplayUniqueElement 
{
	public static int isUnique(int[] ar)
	{
		int count=0;
		for (int i = 0; i < ar.length; i++) 
		{
			boolean b= true;
			for (int j =i+1; j < ar.length; j++) 
			{
				if(ar[i]==ar[j])
				{
					b=false;
					break;
				}
			}
			if (b) 
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		int[] a1 = {12,13,12,14,15,16,17,20,14};
		System.out.println(isUnique(a1));
		
	}
}

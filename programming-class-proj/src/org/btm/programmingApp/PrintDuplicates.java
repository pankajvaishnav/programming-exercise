package org.btm.programmingApp;

import java.util.HashSet;

public class PrintDuplicates 
{
	static int[] ar = {12,13,14,15,12,13,17,12,19,20,14};
	public static void main(String[] args) 
	{
		HashSet<Integer> hs  = new HashSet<Integer>();
		HashSet<Integer> hs2  = new HashSet<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			boolean b=hs.add(ar[i]);
			if(!b)
			{
			//	System.out.print(ar[i]+" ");
				hs2.add(ar[i]);
			}
		}
		System.out.println(hs2);
	}
}

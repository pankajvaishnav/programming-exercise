package org.btm.programmingApp;

import java.util.ArrayList;

public class DistinctPair 
{
	public static void main(String[] args) 
	{
		int ar[] = {1,2,3,5,7,8,9,1,5,5,5};
		int n=10;
		int count=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < ar.length-1; i++)
		{
			for(int j = i+1; j < ar.length; j++)
			{
				if(ar[i]+ar[j]==n)
				{
					if(!(list.contains(i)||list.contains(j)))
					{
						//System.out.println(!(list.contains(i)));
						list.add(i);
						list.add(j);
						System.out.println(ar[i]+"-"+ar[j]);
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}

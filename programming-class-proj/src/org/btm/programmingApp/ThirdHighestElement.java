package org.btm.programmingApp;
import java.util.*;
public class ThirdHighestElement 
{
	public static void main(String[] args) 
	{
		int[] ar = {6,4,6,2,8,9,1,44,22,354,1000,3,4,9,1};
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			hs.add(i);
		}
		for(int i:hs)
		{
			list.add(ar[i]);
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-3));
	}
}

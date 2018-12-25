package org.btm.programmingApp;

import java.util.ArrayList;

public class CountDuplicates 
{
	public static void main(String[] args) 
	{
		int arr[] = {23,4,54,456,32,23,21,13,44,23,4};
		
		int rs = count(arr);
		System.out.println("\nNumber of Duplicate Elements: "+rs);
	}
	
	//trick-3
	private static int count(int[] arr) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			al.add((Integer)arr[i]);
		}
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al.size();j++)
			{
				if(i!=j&&al.get(i)==al.get(j))
				{
					al.remove(i);
				}
			}
		}
		System.out.println(al);
		return arr.length-al.size();
	}

	//trick-2
	/*private static int count(int[] arr) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)	//1 2 2 3 3 4 5      
		{
			hs.add((Integer)arr[i]);	//1 2 3 4 5
		}
		int duplicates = arr.length-hs.size();
		return duplicates;
	}*/
	
	//trick-1
	/*private static int count(int[] arr) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		return count;
	}*/
}

package org.btm.programmingApp;

public class AloneNumber 
{
	public static void main(String[] args) 
	{
		int arr[] = {23,4,54,456,32,23,21,13,44,23,4};
		
		count(arr);
		//System.out.println("\nNumber of Duplicate Elements: "+rs);
	}
	
	private static void count(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//break;
				}
			}
			//if(count==1)
			if(count>1)
			{
				System.out.print(arr[i]+" ");
			}

		}
		//return count;
	}
}

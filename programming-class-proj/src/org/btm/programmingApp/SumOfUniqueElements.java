package org.btm.programmingApp;
public class SumOfUniqueElements 
{
	public static void main(String[] args) 
	{
		int arr[] = {3,4,4,5,6,3,7,3,3,4,1};
		
		int sum = getSum(arr);
		System.out.println("\nSum of Unique Elements is: "+sum);
	}

	private static int getSum(int[] arr) 
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j&&arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				sum+=arr[i];
				System.out.print(arr[i]+" ");
			}
		}
		return sum;
	}
}

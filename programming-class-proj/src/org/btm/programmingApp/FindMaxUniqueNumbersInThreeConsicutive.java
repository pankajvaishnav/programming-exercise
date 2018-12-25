package org.btm.programmingApp;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindMaxUniqueNumbersInThreeConsicutive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Array Elements: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) 
        {
        	ar[i]=sc.nextInt();
        }
        System.out.println("Enter Size Of Sub-Array: ");
        int m = sc.nextInt();
        sc.close();
        int k=0;
        int temp=0;
        Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			
			set.add(ar[i]);
			k++;
			if(k%m==0)
			{
				//System.out.println(set.size());
				if(set.size()>temp)
					temp=set.size();
				i=i-m+1;
				set.clear();
			}
		}
		System.out.println(temp);
	}
}

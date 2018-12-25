package org.btm.programmingApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindSumOfBiggestThree 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements: ");
		int n = sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter Elements: ");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		
		int sum = getSum(ar);
		System.out.println("sum is: "+sum);
	}

	private static int getSum(int[] ar) 
	{
		int sum=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++)
		{
			al.add(ar[i]);
		}
		Collections.sort(al);
		System.out.println(al);
		for(int i=al.size()-1;i>al.size()-4;i--)
		{
			sum+=al.get(i);
		}
		return sum;
	}
}

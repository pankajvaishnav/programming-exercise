package org.btm.programmingApp;
import java.util.Scanner;
public class FindGreatestAmongThree 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Elements: ");
		int n=sc.nextInt();
		int[] ar = new int[n];
		System.out.println("Enter Elements: ");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		sc.close();
		
		int rs=getGreatest(ar);
			System.out.println(rs);
	}

	private static int getGreatest(int[] ar) 
	{
		int sum=0;
		int temp=0;
		int k=0;
		//int rs=0;
		for(int i=0;i<ar.length;i++)
		{
			temp+=ar[i];
			k++;
			System.out.println("temp: "+temp);
			if(k%3==0&&temp>sum)
			{
				//System.out.println("if");
				sum=temp;
				i=i-2;
				temp=0;
				/*if(ar.length-i>3)
					break;*/
			}
			//System.out.println("loop: "+i);
			//System.out.println("sum: "+sum);
		}
		return sum;
	}

}

package org.btm.programmingApp;

import java.util.Scanner;

public class Fetch2DArrayElements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows and Columns");
		int row = sc.nextInt();
		int column = sc.nextInt();
		int[][] ar = new  int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		sc.close();
		getOutput(ar,row,column);
		//System.out.println(output);
	}
	static int i=0,j=0;
	private static String getOutput(int[][] ar, int row, int column) 
	{
		if(row==1&&column==1)
			System.out.print(ar[i][j]);
		else
		{
			if(row==1&&column>1)
			{
				System.out.print(ar[i][j]+" ");
				while(j<column-1)
				{
					j++;
					System.out.print(ar[i][j]+" ");
				}
			}
			else if(column==1&&row>1)
			{
				System.out.print(ar[i][j]+" ");
				while(i<row-1)
				{
					i++;
					System.out.print(ar[i][j]+" ");
				}
			}
			else if(row==2&&column==2)
			{
				System.out.print(ar[i][j]+" ");
				j++;
				System.out.print(ar[i][j]+" ");
				i++;
				j--;
				System.out.print(ar[i][j]+" ");
				j++;
				System.out.print(ar[i][j]+" ");
			}
			else
			{
				System.out.print(ar[i][j]+" ");
				j++;
				System.out.print(ar[i][j]+" ");
				while(i<row-1&&j>0)
				{
					i++;
					j--;
					System.out.print(ar[i][j]+" ");
				}
				if(i<row-1)
				{
					while(i<row-1&&j<column-1)
					{
						i++;
						System.out.print(ar[i][j]+" ");
						while(i>0&&j<column-1)
						{
							i--;
							j++;
							System.out.print(ar[i][j]+" ");
						}
						if(j<column-1)
						{
							j++;
							System.out.print(ar[i][j]+" ");
							while(i<column-1&&j>0)
							{
								i++;
								j--;
								System.out.print(ar[i][j]+" ");
							}
						}
					}
					
					
					if(i==row-1)
					{
						while(j<column-1)
						{
							j++;
							System.out.print(ar[i][j]+" ");
							while(j<column-1&&i>0)
							{
								j++;
								i--;
								System.out.print(ar[i][j]+" ");
							}
							if(j==column-1)
								break;
							j++;
							System.out.print(ar[i][j]+" ");
							while(i<row-1&&j>0)
							{
								i++;
								j--;
								System.out.print(ar[i][j]+" ");
							}
						}
					}
					if(j==column-1)
					{
						while(i<row-1)
						{
							i++;
							System.out.print(ar[i][j]+" ");
							while(i<row-1&&j>0)
							{
								i++;
								j--;
								System.out.print(ar[i][j]+" ");
							}
							if(i==row-1)
								break;
							i++;
							System.out.print(ar[i][j]+" ");
							while(j<column-1&&i>0)
							{
								j++;
								i--;
								System.out.print(ar[i][j]+" ");
							}
						}
					}
					
				}
				if(i==row-1&&j<column-1)
				{
					j++;
					System.out.print(ar[i][j]+" ");
					if(j<column-1)
					{
						i--;
						j++;
						System.out.print(ar[i][j]+" ");
						i++;
						System.out.print(ar[i][j]+" ");
					}
				}
				if(j==column-1&&i<row-1)
				{
					i++;
					System.out.print(ar[i][j]+" ");
					if(i<row-1)
					{
						i++;
						j--;
						System.out.print(ar[i][j]+" ");
						j++;
						System.out.print(ar[i][j]+" ");
					}
				}

			}
		}
		return null;
	}
}

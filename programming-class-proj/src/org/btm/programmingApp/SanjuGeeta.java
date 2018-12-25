package org.btm.programmingApp;
import java.util.Scanner;
public class SanjuGeeta 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n = sc.nextInt();
		sc.close();
		if(n%3==0&&n%5==0)
		{
			System.out.println("Sanju Weds Geeta");
		}
		else if(n%3==0)
		{
			System.out.println("Sanju");
		}
		else if(n%5==0)
		{
			System.out.println("Geeta");
		}
		else
		{
			System.out.println("Not Divisible By 3 or 5");
		}
	}
}

package org.btm.programmingApp;
import java.util.Scanner;
public class LeastAngle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Hour: ");
		int hour = sc.nextInt();
		System.out.println("Enter Minute: ");
		int min = sc.nextInt();
		sc.close();
		int leastAngle = getLeastAngle(min,hour);
		System.out.println("Least Angle Between Minute Arm And Hour Hand: "+leastAngle);
	}

	private static int getLeastAngle(int min, int hour) 
	{
		int leastAngle = 0;
		if(min<=60&&hour<=12)
		{
			int minAngle = min*6;
			int hourAngle = hour*30;
			
			if(minAngle>hourAngle)
			{
				leastAngle = minAngle-hourAngle;
			}
			else
			{
				leastAngle = hourAngle-minAngle;
			}
		}
		else
		{
			System.err.println("Invalid Input!!!");
		}
		return leastAngle;
	}
}

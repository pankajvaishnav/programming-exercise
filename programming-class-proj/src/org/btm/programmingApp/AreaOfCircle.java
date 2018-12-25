package org.btm.programmingApp;
import java.util.Scanner;
public class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radious: ");
		int r = sc.nextInt();
		sc.close();
		float area = (float) (pi*r*r); 
		System.out.println("Area of Circle is: "+area);
	}

}

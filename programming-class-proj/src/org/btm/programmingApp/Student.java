package org.btm.programmingApp;
import java.util.Scanner;
public class Student 
{
	public static void main(String[] args) 
	{
		int total=0;
		float perc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sub-1 marks: ");
		int sub1 = sc.nextInt();
		System.out.println("Enter Sub-2 marks: ");
		int sub2 = sc.nextInt();
		System.out.println("Enter Sub-3 marks: ");
		int sub3 = sc.nextInt();
		System.out.println("Enter Sub-4 marks: ");
		int sub4 = sc.nextInt();
		sc.close();
		
		if((sub1>=0&&sub1<=100)&&(sub2>=0&&sub2<=100)&&(sub3>=0&&sub3<=100)&&(sub4>=0&&sub4<=100))
		{
			total = sub1+sub2+sub3+sub4;
			perc = total/4;
			System.out.println("Sub-1 marks: "+sub1);
			System.out.println("Sub-2 marks: "+sub2);
			System.out.println("Sub-3 marks: "+sub3);
			System.out.println("Sub-4 marks: "+sub4);
			System.out.println("total marks: "+total);
			System.out.println("Percentage: "+perc);
		}
	}
}

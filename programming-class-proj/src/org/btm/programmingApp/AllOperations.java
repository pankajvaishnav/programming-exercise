package org.btm.programmingApp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class AllOperations 
{
	public static void main(String args[])  
	{         
		System.out.println("Enter 1 for Armstrong Operation");
		System.out.println("Enter 2 for palindrome Operation");
		System.out.println("Enter 3 for Factorial Operation");
		System.out.println("Enter 4 for Strong_Number Operation");
		System.out.println("Enter 5 for Happy_Number Operation");
		System.out.println("Enter 6 for Special_number Operation");
		System.out.println("Enter 7 for Anagram_String Operation");
		System.out.println("Enter 8 for Panagram_String Operation");
		System.out.println("Enter 9 for Printing Table of Given Number:");
		System.out.println("===============================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice Here:");
		int choice = sc.nextInt();
		 
		//Integer age = 18;        
		switch (choice)  
		{  
			case(1):
				System.out.println("Enter Any Number: ");
				int armstrong = sc.nextInt();
      			sc.close();
      			isArmstrong(armstrong);
      			break;  
			case(2):
         		System.out.println("Enter Any Number: ");
         		String palindrome = sc.next();
         		sc.close();
         		isPalindrome(palindrome);
                break;  
         	case(3):
         		System.out.println("Enter Any Number");
         		int factorial = sc.nextInt();
    			getFact(factorial);
         		break;
			case(4):
				System.out.println("Enter Any Number: ");
				int strong =  sc.nextInt();
				isStrong(strong);
				break;
         	case(5):
         		System.out.println("Enter Any Number: ");
         		int happynum=sc.nextInt();
         		sc.close();
    			isHappyNum(happynum);
         		break;
         	case(6):
         		System.out.println("Enter Any Two Digit Number: ");
         		int specialnum = sc.nextInt();
         		sc.close();
         		isSpecialNumber(specialnum);
         		break;
         	case(7):
         		Scanner anagram = new Scanner(System.in);
         		System.out.println("Enter First String: ");
         		String s1 = anagram.nextLine();
    			System.out.println("Enter Second String: ");
    			String s2 = anagram.nextLine();
    			sc.close();
    			isAnagram(s1,s2);
         		break;
         	case(8):
         		Scanner panagram = new  Scanner(System.in);
         		System.out.println("Enter String: ");
         		String st = panagram.nextLine();
         		isPanagram(st);
         		break;
         	case(9):
         		System.out.println("Enter Any Number:");
         		int table = sc.nextInt();
    			getTable(table);
         		break;
            default:  
            	System.out.println("Please give the valid Input.");  
                break;  
		}             
	}
	
//<1>//=====================================Print_Table-code==================================================\\
	private static void getTable(int n) 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i*n+" ");
		}
	}
//<2>//=====================================Panagram_String-code==================================================\\
	private static void isPanagram(String st) 
	{
		char[] ch = st.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
				hs.add(ch[i]);
		}
		//System.out.println(hs.size());
		if(hs.size()==26)
			System.out.println("String is Panagram");
		else 
			System.out.println("String is Not Panagram");
	}

//<3>//=====================================Anagram_String-code==================================================\\
	private static void isAnagram(String s1, String s2) 
	{
		ArrayList<Character> al = new ArrayList<Character>();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
			
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					al.add(ch1[i]);
					break;
				}
			}
		}
		System.out.println(al);
		if(ch1.length==al.size())
			System.out.println("String is Anagram");
		else
			System.out.println("String is Not Anagram");
	}
	
//<4>//=====================================Special_Number-code==================================================\\
	private static void isSpecialNumber(int n) 
	{
		int x = n%10;
		int y = n/10;
		
		if((x+y)+(x*y)==n)
		{
			System.out.println("Special Number");
		}
		else
		{
			System.out.println("Not Special Number");
		}
	}
	
//<5>//=====================================Happy_Number-code==================================================\\
	private static void isHappyNum(int n) 
	{
		int sum=0;
		while(n>0)
		{
			int mod=n%10;
			sum+=pow(mod);
			n=n/10;
		}
		if(sum>9)
		{
			n=sum;
			isHappyNum(n);
		}
		else
		{
			if(sum==1||sum==7)
				System.out.println("Happy Number");
			else
				System.out.println("Not Happy Number");
		}
	}
	
	private static int pow(int mod) 
	{
		int pw=1,i=2;
		while(i>0)
		{
			pw*=mod;
			i--;
		}
		return pw;
	}

//<6>//=====================================Strong_Number-code==================================================\\
	private static void isStrong(int n) 
	{
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int mod=n%10;
			sum+=fact(mod);
			n/=10;
		}
		if(temp==sum)
			System.out.println("Strong Number");
		else
			System.out.println("Not Strong Number");
	}
	
	private static int fact(int mod) 
	{
		int fact=1;
		for(int i=1;i<=mod;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
//<7>//=====================================Factorial_Operation-code==================================================\\
	private static void getFact(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

//<8>//=====================================Palindrome_Number-code==================================================\\
	private static void isPalindrome(String s) 
	{
		boolean b = true;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				System.out.println("Not Palindrome");
				b=false;	
				break;
			}
		}
		if(b)
			System.out.println("Palindrome");
			//return true;
	}
	
//<9>//=====================================Armstrong_Number-code==================================================\\
	private static void isArmstrong(int n) 
	{
		String s = "";
		s+=n;
		int temp=n;
		int sum = 0;
			
		while(n!=0)
		{
			int mod = n%10;
			sum=sum+pow(s.length(),mod);
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not ArmStrong");
	}

	private static int pow(int length, int mod) 
	{
		int pw=1;
		while(length>0)
		{
			pw*=mod;
			length--;
		}
		return pw;
	}
			
}

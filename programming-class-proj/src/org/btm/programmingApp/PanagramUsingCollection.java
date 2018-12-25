package org.btm.programmingApp;
import java.util.HashSet;
import java.util.Scanner;
public class PanagramUsingCollection 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = sc.nextLine();
		boolean rs = isPanagram(st);
		if(rs)
			System.out.println("String is Panagram");
		else
			System.out.println("Not Panagram");
		sc.close();
	}
	
	private static boolean isPanagram(String st) 
	{
		st=st.toLowerCase();
		char[] ch = st.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a'&&ch[i]<='z')
				hs.add(ch[i]);
		}
		return hs.size()==26;
	}
}

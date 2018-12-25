package org.btm.programmingApp;										
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class MaxVotesANDBiggerString 
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Number Of Candidates: ");
		int n = sc.nextInt();
		
		System.out.println("ENter Your Vote: ");
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		sc.close();
		
		TreeSet<String> set = new TreeSet<>();
		for(int i=0;i<n;i++)
		{
			set.add(list.get(i));
		}
		
		TreeMap<String, Integer> map = new TreeMap<>();
		for(String vote : set)
		{
			int count=0;
			for(int i=0;i<n;i++)
			{
				if(vote.equals(list.get(i)))
					count++;
			}
			map.put(vote, count);
		}
		System.out.println(map);
		Set<String> keySet = map.keySet();
		int value=0;
		String name="";
		for(String key : keySet)
		{
			if(map.get(key)>=value)
			{
				value=map.get(key);
				name=key;
			}
		}
		System.out.println(name+"-"+value);
	}
}

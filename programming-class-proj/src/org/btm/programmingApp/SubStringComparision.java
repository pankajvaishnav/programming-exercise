package org.btm.programmingApp;

public class SubStringComparision
{
	public static void main(String[] args) 
	{
		String s = "welcometojava";
		int k=3;
		compare(s,k);
	}
	static int x=0;
	private static void compare(String s, int k) 
	{
		String smallest="",largest="";
		char ch1=s.charAt(0),ch2=s.charAt(0);
		int ind1=0,ind2=0;
		for(int i=0;i<s.length()-k;i++)
		{
			//System.out.println(++x);
			if(s.charAt(i)<s.charAt(i+1)&&s.charAt(i)<ch1)
			{
				ch1=s.charAt(i);
				ind1=i;
			}
			else if(s.charAt(i)>s.charAt(i+1)&&s.charAt(i+1)<ch1)
			{
				ch1=s.charAt(i+1);
				ind1=i+1;
			}
			
			if(s.charAt(i)>s.charAt(i+1)&&s.charAt(i)>ch2)
			{
				ch2=s.charAt(i);
				ind2=i;
			}
			else if(s.charAt(i)<s.charAt(i+1)&&s.charAt(i+1)>ch2)
			{
				ch2=s.charAt(i+1);
				ind2=i+1;
			}
		}
		System.out.println(ind1+" "+ind2);
		for(int i=ind1;i<ind1+k;i++)
        {
            smallest+=s.charAt(i);
        }
         for(int i=ind2;i<ind2+k;i++)
        {
            largest+=s.charAt(i);
        }
        System.out.println(smallest+"\n"+largest);
	}
}

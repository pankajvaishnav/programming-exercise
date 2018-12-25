package org.btm.programmingApp;
public class CurrencyFormatter 
{
	static int i=0,y=0,k=0;
	public static void main(String[] args) 
	{
		double d=12345.6789;
		String s="",st="",str="";
        s+=d;
        for(i=s.length()-1;s.charAt(i)!='.';i--)
        {
        	st=s.charAt(i)+st;
        }
        if(st.length()>2)
        {
        	for(int j=0;j<2;j++)
        	{
        		str+=st.charAt(j);
        	}
        }
        while(i>=0)
        {
        	k++;
        	if(k%5==0)
        		str=','+str;
        	str=s.charAt(i)+str;
        	i--;
        }
        String us="$"+str;
        String india="Rs."+str;
        String china="￥"+str;
        String fstr=str.replace(',', ' ');
        String france=fstr.replace('.', ',')+" €";
        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	}
}

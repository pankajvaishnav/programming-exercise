package org.btm.programmingApp;
public class SearchSubString 
{
	static int j=0;
	public static void main(String[] args) 
	{
		String input = "my name is pankaj vaishnav";
		String search = "na";
		char ch[] = input.toCharArray();
		int k=0;
		String st="";
		int ind=0;
		for(int i=0;i<ch.length;i++)
		{
			st+=ch[i];
			k++;
			if(ch[i]==' ')
			{
				ind=i+1;
			}
			if(k%search.length()==0)
			{
				int pos=i-ind;
				int z=ind;
				if(st.equals(search))
				{
					System.out.print(++j+". ");
					while(ch[z]!=' '&&z<ch.length)
					{
						if(z>=ind-1+pos&&z<=ind-1+pos+search.length()-1)
							System.out.print((char)(ch[z]-32));
						else
							System.out.print(ch[z]);
						z++;
						if(z>ch.length-1)
							break;
					}
					System.out.print("-"+pos);
					System.out.println();
				}
				st="";
				i=i-search.length()+1;
			}
		}
	}
}

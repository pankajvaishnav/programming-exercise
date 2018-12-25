package org.btm.programmingApp;

public class BigIntegerDemo 
{
	public static void main(String[] args) {
		String s = "my name is pankaj";
		String[] str = s.split(" ");
		System.out.println(str.length);
		for(int i=0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
	
	/*public static void main(String[] args) {
		String str = "abcdefghi";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}*/
}

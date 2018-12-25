package org.btm.programmingApp;
public class SmallestAndLargestSubStringOfGivenStrin 
{
	public static void main(String[] args) 
	{
		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int k=30;
		
		System.out.println(getSmallestAndLargest(s,k));
	}

	private static String getSmallestAndLargest(String s, int k) 
	{
		String smallest = "";
        String largest = "";
        char[] ch = s.toCharArray();
        for(int i=0;i<=ch.length-k+1;i++)
        	if(ch[i]>ch[i+1])
        	{
        		System.out.print(ch[i+1]+" ");
        	}
        for(int i=0;i<=ch.length-k+1;i++)
        	if(ch[i]<ch[i+1])
        	{
        		System.out.print(ch[i+1]+" ");
        	}
        return smallest + "\n" + largest;
	}
}

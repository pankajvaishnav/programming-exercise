package org.btm.programmingApp;
public class SortArrayUsingSingleLoop 
{
	public static void main(String[] args) {
		int ar[] = {2,4,3,1,5,6};
		boolean b = false;
		for(int i=0;i<ar.length-1;i++) {
			int temp = 0;
			
			if(ar[i+1] < ar[i]) {
				temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1] = temp;
				b=true;
			}
			if(i == ar.length-2 && b == true) {
				i = -1;
				b = false;
			}
		}
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}

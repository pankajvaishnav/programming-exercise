package org.btm.programmingApp;

import java.util.Scanner;

public class Game_Hackerrank 
{
	 public static boolean canWin(int m, int[] array,int k) 
	    {
	      if (k < 0 || array[k] == 1) {
	        return false;
	    } else if (k + 1 >= array.length || k + m >= array.length) {
	        return true;
	    }
	        
	    array[k] = 1; // marks as visited

	    /* Recursive Cases */
	    return canWin(m,array, k + m) || 
	           canWin(m,array, k + 1) || 
	           canWin(m,array, k - 1);
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        int k=0;
	        
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap,game,k)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }
}

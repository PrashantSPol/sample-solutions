package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _4_BetweenTwoSets {
	static int getTotalX(int[] a, int[] b) {
       int gcd = 0;
       for(int i : b) {
    	   gcd = gcd(gcd, i);
       }
       
       int lcm = 1;
       for(int i : a) {
    	   lcm = lcm(lcm, i);
       }
       
       if(gcd < lcm) {
    	   return 0;
       }
       if(gcd % lcm != 0) {
    	   return 0;
       }
       if(lcm <= 0) {
    	   return 0;
       }
       
       int multiple = 1;
       for(int i = lcm; i < gcd; i++) {
    	   if(i % lcm == 0 && gcd % i == 0) {
    		   multiple++;
    	   }
       }
       
       return multiple;
    }
	
	static int gcd(int a, int b) {
		while(a > 0 && b > 0) {
			if(a >= b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		
		return a + b;
	}
	
	static int lcm(int a , int b) {
		return a * b / gcd(a, b);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}

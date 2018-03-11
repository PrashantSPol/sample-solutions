package easy;

import java.util.Scanner;

public class _1_GradingStudent {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
	
	static int[] solve(int[] arr) {
		int[] result = new int[arr.length];
		for(int i = 0; i< arr.length; i++) {
			result[i] = arr[i] < 38 || arr[i] % 5 <= 2 ? arr[i] : (arr[i] + 2) / 5 * 5;
		}
		
		return result;
	}
}

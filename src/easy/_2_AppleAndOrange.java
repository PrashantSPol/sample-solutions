package easy;

import java.util.Scanner;

public class _2_AppleAndOrange {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int apple = 0, orange = 0;
        int appleMinDiff = s - a;
        int appleMaxDiff = t - a;
        int orangeMinDiff = t - b;
        int orangeMaxDiff = s - b;
        for(int i = 0; i < apples.length; i++) {
        	if(apples[i] >= appleMinDiff && apples[i] <= appleMaxDiff) {
        		apple++;
        	}
        }
        
        for(int i = 0; i< oranges.length; i++) {
        	if(oranges[i] <= orangeMinDiff && oranges[i] >= orangeMaxDiff) {
        		orange++;
        	}
        }
        
        System.out.println(apple);
        System.out.println(orange);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apple, orange);
        in.close();
    }
}

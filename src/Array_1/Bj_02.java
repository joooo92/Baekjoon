package Array_1;

import java.util.Scanner;

public class Bj_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int[] a = new int[n];
		for(int b = 0; b < a.length; b++) {
			
			a[b] = scan.nextInt();
			
			if(a[b] < x) {
				System.out.println(a[b]);
			}
			
		}

		
		
		
		
		
		
		
	}
}

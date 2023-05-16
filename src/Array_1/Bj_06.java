package Array_1;

import java.util.Scanner;

public class Bj_06 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt(); // 주머니 수 
		
		int[] n = new int[n1]; // 주머니속 공의 갯수
		int temp = 0;
		int m = scan.nextInt(); // 변경될 횟수
		
		
		for(int a = 0; a < n1; a++) {
			n[a] = a+1;
		}

		for(int b = 1; b <= m; b++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			temp = n[j-1];
			n[j-1] = n[i-1];
			n[i-1] = temp;
			temp = 0;
		}
		for(int p = 0; p < n.length;  p++) {
			System.out.println(n[p]);
			
		}

		
	}

}

package Array_1;

import java.util.Scanner;

public class Bj_04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[9];	
		for(int b = 0; b < a.length; b++) {
			
			a[b] = scan.nextInt();

		}// 서로다른 n개의 자연수를 배열에 저장함
		
		
		// 배열을 비교하며 최댓값을 구하고, 그 수의 배열의 위치 뽑기

		
		int max = a[0];
		int count = 0;
		for(int i = 1; i < a.length; i++) {
			
			if(max < a[i]) {
				max = a[i]; 
				count = i + 1;
			}
				
			
		}
		
		System.out.println(max);
		System.out.println(count);
	}
}

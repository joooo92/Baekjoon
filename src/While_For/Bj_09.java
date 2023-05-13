package While_For;

import java.util.Scanner;

public class Bj_09 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int a = 1 ; a <= n; a++) {
			for(int b = 1; b < a; b++) {
			
			System.out.print("*");
			
			}
			//System.out.println();
			System.out.println("*");
		}
	}
}

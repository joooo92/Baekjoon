package While_For;

import java.util.Scanner;

public class Bj_07 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 1; i <= t; i++) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a + b;
			System.out.println("Case #" + i + ": " + c);
		}
	}
}

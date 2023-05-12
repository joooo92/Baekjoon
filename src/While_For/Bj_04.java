package While_For;

import java.util.Scanner;

public class Bj_04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		int p = 0;
		
		for(int i = 1; i <= n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			p += a * b;
		}
		if(x == p) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}

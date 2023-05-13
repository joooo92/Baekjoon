package While_For;

import java.util.Scanner;

public class Bj_10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for(int a = 0; a < n; a++) {
			for(int b = 1; b < n-a; b++) {

				System.out.print(" ");
			}

			for(int c = 0; c <= a; c++) {

				System.out.print("*");

			}
			System.out.println("");
		}


	}

}

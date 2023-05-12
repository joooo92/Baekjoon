package While_For;

import java.util.Scanner;

public class Bj_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int n = scan.nextInt();
		String str = "";
		
		for(int a = 1; a <= n/4; a++) {
			str += "long ";
		}
		System.out.println(str + "int");
		
		
	}

}

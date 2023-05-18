package String;


import java.util.Scanner;

public class Bj_05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String str = scan.next();
		
		int result = 0;
		
		for(int a = 0; a < str.length(); a++) {

			result += str.charAt(a) - '0';
			
		}
		
		System.out.println(result);
				
	}

}

package While_For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Bj_06 {
	public static void main(String[] args) {
				
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String str = br.readLine();
			
			int t = Integer.parseInt(str);
			
			for(int i = 1; i <= t; i++) {
				String[] s2 = br.readLine().split(" "); 
 				int a = Integer.parseInt(s2[0]);
				int b = Integer.parseInt(s2[1]);
				
				int c = a + b;
				
				String s3 = Integer.toString(c);
				bw.write(s3);
				bw.write("\n");
				
				
			}
			

			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}

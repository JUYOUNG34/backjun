import java.util.Scanner;
public class test_2675 {
 
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int T = a.nextInt();
		for(int i = 0; i < T; i++) {
	
			int R = a.nextInt();
			String S = a.next();	
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < R; k++) {	
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
	}
}

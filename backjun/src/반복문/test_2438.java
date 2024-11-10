package 반복문;

import java.util.Scanner;

public class test_2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i=1; i<=T; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

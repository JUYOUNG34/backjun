package 조건문;

import java.util.Scanner;

public class test_1330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();

        System.out.println(A > B ? ">" : A < B ? "<" : "==" );
    }
}
package 반복문;

import java.util.Scanner;

public class test_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a * b;
        }
        if (X == total) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}

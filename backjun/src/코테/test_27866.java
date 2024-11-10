package 코테;

import java.util.Scanner;

public class test_27866 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] xy = new int[101][101];
        int sum = 0;

        for (int i = 0; i<4; i++){
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();

            for(int x = x1; x < x2; x++){
                for (int y = y1; y < y2 ; y++){
                    xy[x][y] =1;
                }}}
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 100; y++) {
                sum += xy[x][y];
            }
        }
        System.out.println(sum);
    }
}



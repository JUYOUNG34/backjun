package 일차원배열;

import java.util.Scanner;

public class test_10807 { //총 N개의 정수가 주어졌을 떼, 정수 v가 몇 개인지 구하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //N은 정수의 개수
        int ary[] = new int[N];
        int sum= 0;

        for(int i=0; i<ary.length; i++){
            ary[i] = sc.nextInt();
        }
        int v = sc.nextInt();  // 찾을 정수

        for(int i=0; i<ary.length; i++) {
            if(ary[i]== v)  // 배열의 값과 정수가 일치하는 경우 count++
              sum++;
        }

        System.out.println(sum);

    }
}

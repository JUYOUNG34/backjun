package 일차원배열;

import java.util.Scanner;

public class test_5597 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int cnt = 0;
        int ary = s.nextInt();
        int array[] = new int[ary];
        int answerArray[] = new int[ary];

        for(int i = 0; i< ary; i++) {
            array[i]=s.nextInt();
        }
        for(int j = 0; j< ary; j++) {
            if(array[j]<N){
                answerArray[cnt]=array[j];
                cnt++;

            }
        }
        for(int k=0;k<cnt;k++) {
            System.out.print(answerArray[k]+" ");

        }}}





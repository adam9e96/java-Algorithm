package baekjoon;

import java.util.Scanner;

/*
  2444 번 문제
  별 찍기 - 7
  https://www.acmicpc.net/problem/2444
 */
public class _2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = 0;
        int max = num - 1;
        for (int i = 0; i < 2 * num - 1; i++) {
            for (int j = 0; j < 2 * i + 1 - k; j++) {
                for (int l = 0; l < num; l++) {


                }

                System.out.print("*");

            }
            if (i >= max) {
//                System.out.println("i값 :" + i);
                k += 4;
            }

            System.out.println();
        }
    }
}
package baekjoon;

import java.util.Scanner;

/*
  2566 번 문제
  최댓값
  https://www.acmicpc.net/problem/2566
 */
public class _2566 {

    public static void main(String[] args) {
        int[][] a = new int[9][9];
        int MAX = 0;
        String index = "1 1";


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            String[] b = sc.nextLine().split(" ");
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(b[j]);
                if (MAX < a[i][j]) {
                    MAX = a[i][j];
                    index = (i + 1) + " " + (j + 1);
                }
            }
        }

        // System.out.println(Arrays.deepToString(a));
        //   System.out.println("재앙스: " + MAX);
        // System.out.println("위치: " + index);

        System.out.println(MAX);
        System.out.println(index);
    }
}
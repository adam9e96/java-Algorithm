package baekjoon;

import java.util.Scanner;

/*
  2438 번 문제
  행렬 덧셈
  https://www.acmicpc.net/problem/2738
 */
public class _2738 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        // 행렬 크기 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        matrix = new int[n][m];
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        // 0 < n,m <= 100
        // a,b 행렬 초기화
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += (a[i][j] + b[i][j]);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package baekjoon;

import java.util.Scanner;

/*
  10950 번 문제
  A+B - 3
  https://www.acmicpc.net/problem/10950
 */
public class _10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int arr[] = new int[t];
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = (a + b);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
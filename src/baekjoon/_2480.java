package baekjoon;

import java.util.Scanner;

/*
  2480 번 문제
  주사위 세개
  https://www.acmicpc.net/problem/2480
 */
public class _2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        System.out.println(a + "," + b + "," + c);
        if (a == b && b == c) { // 3개 모두 같음
            System.out.println(10000 + a * 1000);

        } else if (a == b || a == c) {//  2개 같음

            System.out.println(1000 + a * 100);

        } else if (b == c) { // b 2개 같음
            System.out.println(1000 + b * 100);

        } else {
            if (a >= b && a >= c) {
                System.out.println(100 * a);
            } else if (b >= a && b >= c) {
                System.out.println(100 * b);

            } else {
                System.out.println(100 * c);
            }


        }

    }
}
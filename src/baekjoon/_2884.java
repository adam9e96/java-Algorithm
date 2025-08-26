package baekjoon;

import java.util.Scanner;

/*
  2884 번 문제
  알람시계
  https://www.acmicpc.net/problem/2884
 */
public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 <= H <= 23
        int H = sc.nextInt();
        // 0 <= M <= 59
        int M = sc.nextInt();

        int num = H * 60 + M;
//        System.out.println(num);
        if (num >= 45) {
            num -= 45;
            H = num / 60;
            M = num % 60;
        } else {
            H = 23;
//            M = -(num - 45) + 30;
            M = 60 - 45 + M;
        }
        System.out.println(H + " " + M);
    }
}
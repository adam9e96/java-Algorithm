package baekjoon;

import java.util.Scanner;

/*
  25314 번 문제
  코딩은 체육과목 입니다.
  https://www.acmicpc.net/problem/25314
 */
public class _25314 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "long";
        for (int i = 0; i < n; i+=4) {
            System.out.print(a+" ");
        }
        System.out.print("int");


    }
}
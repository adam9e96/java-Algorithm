package baekjoon;

import java.util.Scanner;

/*
  27866 번 문제
  문자와 문자열
  https://www.acmicpc.net/problem/27866
*/
public class _1019 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        char[] chars = s.toCharArray();
        char result = chars[i - 1]; // Sprout

        System.out.println(result);
    }
}
package baekjoon;

import java.util.Scanner;

/*
  27866 번 문제
  문자와 문자열
  https://www.acmicpc.net/problem/27866
*/
public class _1019_enhanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(s.charAt(i - 1));
    }
}
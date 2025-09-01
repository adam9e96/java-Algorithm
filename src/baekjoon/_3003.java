package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/*
  3003 번 문제
  킹, 퀸, 룩, 비숍, 나이트, 폰
  https://www.acmicpc.net/problem/3003
*/
public class _3003 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");

        int[] result = new int[6];
//        System.out.println(Arrays.toString(s));
        int[] arr = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Integer.parseInt(s[i])) {
                result[i] += 0;
            } else if (arr[i] > Integer.parseInt(s[i])) {
                result[i] += arr[i] - Integer.parseInt(s[i]);
            } else {
                result[i] += arr[i] - Integer.parseInt(s[i]);
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
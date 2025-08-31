package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
  10809 번 문제
  알파벳 찾기
  https://www.acmicpc.net/problem/10809
 */
public class _10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] word = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] result = new int[26];
        Arrays.fill(result, -1); // 기본값 -1

//        System.out.println(word.length);
//        System.out.println(s.length());
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == word[i]) {
                    if (result[i] == -1) {
                        result[i] = j; // 처음 나온 위치만 저장
                    }
                    break; // 찾으면 다음으로
                }
            }
        }
        for (int c : result) {
            System.out.print(c + " ");
        }

    }
}
package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
  1316 번 문제
  그룹 단어 체커
  https://www.acmicpc.net/problem/1316
 */
public class _1316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));

//        System.out.println(arr.length);
        int count = 0;

        String[] temp = Arrays.copyOf(arr, arr[0].length());
//        System.out.println(arr[0].charAt(0)); // 1
//        System.out.println(arr[0].charAt(1)); // 1
//        System.out.println(arr[0].charAt(2)); //
//        System.out.println(arr[0].charAt(3)); // 1
//        System.out.println(arr[0].charAt(4)); // 1
//
//
//        System.out.println(arr[1].charAt(0)); // 1
//        System.out.println(arr[1].charAt(1)); // 1
//        System.out.println(arr[1].charAt(2)); // 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                // arr[i].charAt(j)
                System.out.println(arr[i].charAt(j));
            }
            System.out.println();
        }
    }
}
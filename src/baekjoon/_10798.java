package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
  10798 번 문제
  세로읽기
  https://www.acmicpc.net/problem/10798
*/
public class _10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        int length = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLine();
            if (length < arr[i].length()) {
                length = arr[i].length();
            }
        }

//        System.out.println(Arrays.toString(arr));

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 5; j++) {
//                System.out.println("d: "+ arr[j].length());
                if (i < arr[j].length()) {   // 인덱스 존재할 때만
                    result.append(arr[j].charAt(i));
                }
            }
        }

        System.out.println(result);
    }
}
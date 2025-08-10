package baekjoon;

import java.util.Scanner;

/*
  10807 번 문제
  개수 세기
  https://www.acmicpc.net/problem/10807
 */
public class _10807 {
    public static void main(String[] args) {

        // 1 <= N <= 100
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arrays[] = new int[n];

//		System.out.println(arrays.length);

        for (int i = 0; i < n; i++) {
            arrays[i] = scanner.nextInt();
//			 System.out.println(arrays[i]);
        }


        int count = 0;
        int result = scanner.nextInt(); // 찾으려는 숫자

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == result) {
                count++;
            }
//			System.out.println(arrays[i]);
        }
//
        System.out.println(count);

        scanner.close();

    }
}
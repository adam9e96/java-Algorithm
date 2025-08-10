package baekjoon;

import java.util.Scanner;

/*
  10871 번 문제
  X보다 작은 수
  https://www.acmicpc.net/problem/10871
 */
public class _10871 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1 <= N, X <= 10000
        int n = scanner.nextInt(); // N
        int x = scanner.nextInt(); // X =5


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

//		int result[] = new int[n];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
//				result[count++] = arr[i];
                if (count == 0) {
                    System.out.print(arr[i]);
                    count++;
                } else {
                    System.out.print(" " + arr[i]);
                }
            }
        }

//		for(int i = 0; i< result.length;i++) {
//			if(result[i] != 0) {
//				System.out.print(result[i]+ " ");
//			}
//		}


        scanner.close();

    }
}
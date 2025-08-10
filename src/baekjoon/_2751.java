package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
  2751 번 문제
  수 정렬하기 2
  https://www.acmicpc.net/problem/2751
*/
public class _2751 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        // 1. 처리로직(전통적인 버블 정렬 알고리즘)-> 버블정렬은 O(n2)알고리즘
        // N(1<= N <= 1000000)정도로 큰 수기준 정렬문제일 경우 시간초과
        // Arrays에서 제공하는 함수를 쓰거나 퀵정렬등을 사용해야됨
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        // 2. 기본 제공 함수(퀵정렬 보다 빠름)
        Arrays.sort(arr);


        // 출력
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
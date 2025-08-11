package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
  1026 번 문제
  보물
  https://www.acmicpc.net/problem/1026
*/
public class _1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N 받고
        // n = 5

        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);



//        for (int c : a){
//            System.out.println(c);
//        }
//        for (int i: b){
//            System.out.println(i);
//        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[n - 1 - i];
//            System.out.print(sum + "\t");
        }
        System.out.println(sum);
    }
}
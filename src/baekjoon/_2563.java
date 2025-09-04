package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
  2563 번 문제
  색종이
  https://www.acmicpc.net/problem/2563
 */
public class _2563 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[100][100];
        //      a[0 ~99][0 ~99] ==0
        int[][] b = new int[100][100];
        int[][] c = new int[100][100];
        int[] f = new int[10];

        int count = 0;
        for (int[] i : a) {
            System.out.println("실행됨: " + count++);
            Arrays.fill(i, 0);
        }
        for (int[] i : b) {
            System.out.println("실행됨: " + count++);
            Arrays.fill(i, 0);
        }
        for (int[] i : c) {
            System.out.println("실행됨: " + count++);
            Arrays.fill(i, 0);
        }

        /*
        for (int i=0; i<100;i++){
            System.out.println("실행됨: " + count++);
            Arrays.fill(a[i],0);
        }
        */

        System.out.println(Arrays.deepToString(a));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int t = Integer.parseInt(st.nextToken()); // 3
//        int p = Integer.parseInt(st.nextToken()); // 7
//
//        int maxX = t + 10; // 13
//        int maxY = p + 10; // 17
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                a[t][p] = 1;
//                t++;
//                p++;
//            }
//        }
//        System.out.println(Arrays.deepToString(a));

    }
}
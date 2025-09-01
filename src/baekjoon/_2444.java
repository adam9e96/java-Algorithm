package baekjoon;

import java.util.Scanner;

/*
  2444 번 문제
  별 찍기 - 7
  https://www.acmicpc.net/problem/2444
 */
public class _2444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        int max = num - 1;
        int total = 2 * num - 1; // ex) 9
        int space = 0;
        int star = 0;
        for (int i = 0; i < total; i++) {
            // 위
            // i = 0 일 때 공백4 별1
            // i = 1 일 때 공백3 별3
            // i = 2 일 때 공백2 별5
            // i = 3 일 때 공백1 별7
            // i = 4 일 때 공백0 별9 --> 고점
            // 아래
            // i = 5 일 때 공백1 별7
            // i = 6 일 때 공백2 별5
            // i = 7 일 때 공백3 별3
            // i = 8 일 때 공백4 별1
            if (i < num) {
                space = num - i - 1; // 4
                star = 2 * i + 1; // 1
            } else {
                // 아래 i = 5일때부터 O
                space = num + i - total; // 1  ->  i- 4이라 5부터 1234 i가 8까지 4까지커짐
                star = (2 * total - 2 * i - 1); // 7 // i5부터 7 , i6 18-
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

}
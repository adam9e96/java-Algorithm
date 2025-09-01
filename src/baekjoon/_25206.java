package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
  25206 번 문제
  너의 평점은
  https://www.acmicpc.net/problem/25206
 */
public class _25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subTitle = new String[20];
        Double[] subA = new Double[20];
        String[] subB = new String[20];
        double result = 0.0;

        for (int i = 0; i < 20; i++) {
            // readLine() <-- 입출력 작업은 1회만 진행
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken(); // 과목명
            double b = Double.parseDouble(st.nextToken()); // 학점 ex) 3.0
            String c = st.nextToken(); // 등급 ex) B+

            subTitle[i] = a;
            subA[i] = b;
            subB[i] = c;
        }

//        System.out.println(Arrays.toString(subTitle));
//        System.out.println(Arrays.toString(subA));
//        System.out.println(Arrays.toString(subB));


        double temp = 0;
        int count = 0;
        double grade = 0;
        for (int i = 0; i < 20; i++) {
            if (subB[i].equals("A+")) {
                temp += 4.5 * subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("A0")) {
                temp += 4.0 * subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("B+")) {
                temp += 3.5 * subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("B0")) {
                temp += 3.0 * subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("C+")) {
                temp += 2.5 * subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("C0")) {
                temp += 2.0 * subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("D+")) {
                temp += 1.5 * subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("D0")) {
                temp += subA[i];
//                System.out.println("temp 값: " + temp);
                count += subA[i];
            } else if (subB[i].equals("F")) {
                temp += 0;
                count += subA[i];
            } else if (subB[i].equals("P")) {
            }
        }

//        System.out.println("temp: " + temp);
//        System.out.println("count: " + count);
        result = temp / count;
        System.out.println(result);
    }
}
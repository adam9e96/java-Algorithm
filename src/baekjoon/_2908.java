package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  2908 번 문제
  상수
  https://www.acmicpc.net/problem/2908
 */
public class _2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // readLine() <-- 입출력 작업은 1회만 진행
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        String[] arr = new String[3];
        String[] arr2 = new String[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = String.valueOf(a.charAt(2 - i));
            arr2[i] = String.valueOf(b.charAt(2 - i));
        }
        String r1 = String.join("", arr);
        String r2 = String.join("", arr2);

        if (Integer.parseInt(r1) > Integer.parseInt(r2)) {
            System.out.println(r1);
        } else {
            System.out.println(r2);
        }
    }
}
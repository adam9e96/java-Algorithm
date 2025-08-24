package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/*
  10757 번 문제
  큰 수 A+B
  https://www.acmicpc.net/problem/10757
  long 타입 보다 더 큰 정수를 다루려면 java.math.BigInteger 클래스를 사용해야 한다.
  long 은 64비트 크기로 제한된 바면, BigInteger는 문자열 형태로 숫자를 처리하기 때문에
  long 으로 표현할 수 있는 범위를 넘어서는 매우 큰 정수도 다룰 수 잇다.
  계산은 메서드로 해야한다
 */
public class _10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  BigInteger 입력 받음
        BigInteger bigNum1 = sc.nextBigInteger();
        BigInteger bigNum2 = sc.nextBigInteger();

        // 덧셈
        BigInteger sum = bigNum1.add(bigNum2);
        System.out.println(sum);

    }
}

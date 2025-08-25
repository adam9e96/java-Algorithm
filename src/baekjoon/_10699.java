package baekjoon;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
  10699 번 문제
  오늘 날짜
  https://www.acmicpc.net/problem/10699
  자바에서 날짜포맷에 DD는 일(Day)을 의미하며, 두 자리 숫자로 표현된다.
  현재 날짜가 5월 1일을 의미하면 05로 표기된다.
  DD 자체만으로는 날짜 형식이 아니고 yyyy-MM-dd나 MM/dd/yyyy 와 같이
  연도(yyyy)와 월(MM)과 결합하여 사용해야 한다.
 */
public class _10699 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        String strToday = sdf.format(calendar.getTime());

        System.out.println(strToday);
    }
}
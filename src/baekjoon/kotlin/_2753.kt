package baekjoon.kotlin

/*
  2753 번 문제
  윤년
  https://www.acmicpc.net/problem/2753
 */
fun main() {
    val num: Int = readln().toInt()

//    println(num)
    if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
        println(1)
    } else {
        println(0)
    }
}
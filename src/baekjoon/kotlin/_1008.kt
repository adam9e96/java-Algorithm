package baekjoon.kotlin

/*
  1008 번 문제
  A/B
  https://www.acmicpc.net/problem/1008
*/
fun main() {
//    val num1: Int = readLine()!!.toInt() // 입력받아 정수로 변환
//    val num2: Int = readLine()!!.toInt()
//    println(num1 * num2)

    val number: List<String> = readln().split(" ")
    println(number[0].toDouble() / number[1].toDouble())
}
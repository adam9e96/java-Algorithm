package baekjoon.kotlin

/*
  1001 번 문제
  A-B
  https://www.acmicpc.net/problem/1001
*/
fun main() {
//    val num1: Int = readLine()!!.toInt() // 입력받아 정수로 변환
//    val num2: Int = readLine()!!.toInt()
//    println(num1 * num2)

    val number = readLine()!!.split(" ")
    println(number[0].toInt() * number[1].toInt())
}
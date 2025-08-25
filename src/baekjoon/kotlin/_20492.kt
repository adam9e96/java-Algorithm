package baekjoon.kotlin

/*
  20492 번 문제
  세금
  https://www.acmicpc.net/problem/20492
*/
fun main() {
    val num1: Int = readln().toInt()
    val res1: Int = num1 - (num1 * 0.22).toInt()
    val res2 : Int = (num1 - (num1 * 0.20 * 0.22).toInt())
    println("$res1 $res2")
}
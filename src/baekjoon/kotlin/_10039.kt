package baekjoon.kotlin

/*
  10039 번 문제
  평균 점수
  https://www.acmicpc.net/problem/10039
*/
fun main() {
//    val numbers = readln().split(" " ).map { it.toInt() }
//    println(numbers)

    var sum = 0
    for (i in 1..5) {
        val num1 = readln().toInt()
        if (num1 < 40) {
            sum += 40
        } else {
            sum += num1
        }
    }
    println((sum / 5).toInt())
}
package baekjoon.kotlin

fun main() {
    val input = readln().split(" ").map { it.toInt() }

    val (a, b) = readln().split(" ").map { it.toInt() }

    println(input[0] + input[1])
    println("$a + $b")
}
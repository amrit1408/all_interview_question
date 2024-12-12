package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(3, 0, 1)
    println(findMissingNumber(arr))
}

fun findMissingNumber(arr: Array<Int>): Int {
    val l = arr.size
    val totalSum = (l * (l + 1)) / 2
    var sum = 0
    arr.forEach { sum += it }
    println(totalSum)
    println(sum)
    return totalSum - sum
}
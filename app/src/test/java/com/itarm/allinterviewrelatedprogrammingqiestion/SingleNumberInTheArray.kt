package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayListOf(1, 2, 3, 1, 3)
    var num = 0
    for (i in arr.indices) {
        num = num xor arr[i]
    }
    println(num)
}
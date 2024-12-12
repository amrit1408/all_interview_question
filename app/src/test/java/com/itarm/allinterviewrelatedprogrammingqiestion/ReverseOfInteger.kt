package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val num = 1534236469
    println(reverse(num))
}

fun reverse(x: Int): Int {
    val intMin = Int.MIN_VALUE / 10 // -2^31
    val intMax = Int.MAX_VALUE / 10
    var num = x
    var sum = 0

    while (num != 0) {
        val rem = num % 10
        num /= 10
        if (sum > intMax || (sum == intMax && rem > 7)) return 0
        if (sum < intMin || (sum == intMin && rem < -8)) return 0
        sum = sum * 10 + rem

    }
    return  sum
}
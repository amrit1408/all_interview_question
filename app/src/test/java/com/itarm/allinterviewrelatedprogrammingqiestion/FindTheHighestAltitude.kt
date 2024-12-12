package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val nums = arrayOf(-5, 1, 5, 0, -7)
    println(findTheHighestAltitude(nums))
}

fun findTheHighestAltitude(gain: Array<Int>):Int {
    var sum = 0
    var max = sum
    for (i in gain) {
        sum += i
        max = Math.max(max, sum)
    }
    return max
}
package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(-1)
    val k = 1
    println(maximumAverageOfSubArray(arr, k))
}

fun maximumAverageOfSubArray(nums: Array<Int>, k: Int): Double {
    var sum = 0.0
    var max:Double = Integer.MIN_VALUE.toDouble()
    for (i in 0..<k) {
        sum += nums[i]
    }
    max = Math.max(max, sum / k)
    var startIndex = 0
    var endIndex = k
    while (endIndex < nums.size) {
        sum -= nums[startIndex]
        startIndex++

        sum += nums[endIndex]
        endIndex++

        max = Math.max(max, sum / k)
    }
    return max

}
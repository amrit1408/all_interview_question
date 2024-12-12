package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val nums = arrayOf(2, 1, -1)
    println(findPivotElement(nums))
    println(findPivotElementV2(nums))
}

//best way to solved O(n)
fun findPivotElementV2(nums: Array<Int>): Int {
    var rightSum = 0
    var leftSum = 0

    nums.forEach { rightSum += it }
    nums.forEachIndexed { index, i ->
        rightSum -= i
        if (leftSum == rightSum) {
            return index
        } else {
            leftSum += i
        }

    }

    return -1
}


// bed way to solved O(n^2)
fun findPivotElement(nums: Array<Int>): Int {
    var p = 0
    while (p < nums.size) {
        val leftSum = leftSum(nums, p)
        val rightSum = rightSum(nums, p)
        if (leftSum == rightSum) {
            return p
        }
        p++
    }
    return -1
}

fun leftSum(nums: Array<Int>, p: Int): Int {
    if (p == 0) {
        return 0
    }

    var leftSum = 0
    var i = 0
    while (i < p) {
        leftSum += nums[i]
        i++
    }

    return leftSum
}

fun rightSum(nums: Array<Int>, p: Int): Int {
    if (p == nums.size - 1) return 0
    var rightSum = 0
    var j = nums.size - 1
    while (p < j) {
        rightSum += nums[j]
        j--
    }

    return rightSum
}
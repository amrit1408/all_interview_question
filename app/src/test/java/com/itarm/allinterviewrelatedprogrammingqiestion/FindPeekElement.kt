package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(-2147483648)
    println(findPeekElement(arr))

}

fun findPeekElement(nums: Array<Int>): Int {
    val hashMap = HashMap<Int, Int>()
    var max = Integer.MIN_VALUE

    for (i in nums.indices) {
        hashMap[nums[i]] = i
        if (max < nums[i]) {
            max=nums[i]
        }
    }

    return hashMap.getValue(max)

}
package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(0, 2, 1, 0)
    peekIndexOfMountain(arr)
}

fun peekIndexOfMountain(nums: Array<Int>) {
    val hashMap = HashMap<Int, Int>()
    var max = -1
    for (i in nums.indices) {
        if (max < nums[i]) {
            max = nums[i]
            hashMap[nums[i]] = i
        }
    }
    println("${hashMap.getValue(max)}")

}
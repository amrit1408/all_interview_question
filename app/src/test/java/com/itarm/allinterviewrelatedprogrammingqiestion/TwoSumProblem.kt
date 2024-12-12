package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(2, 7, 11, 15, 3)
    val target = 9
    println(twoSumIndex(arr, target))
}

fun twoSumIndex(nums: Array<Int>, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    val newArr = IntArray(2)
    for (i in nums.indices) {
        map[nums[i]] = i
    }

    for (i in nums.indices) {
        val diff = target - nums[i]
        if (map.containsKey(diff) && map[diff] != i) {
            newArr[0]=i
            newArr[1]=map.getValue(diff)
            return newArr
        }
    }
    return newArr
}
package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val nums = arrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    println(findAllTheNumDisappearInAnArray(nums))
}

fun findAllTheNumDisappearInAnArray(nums: Array<Int>): List<Int> {
    for (i in nums) {
        val index = Math.abs(i)
        if (nums[index-1] > 0) {
            nums[index-1] *= -1
        }
    }

    val newArr = mutableListOf<Int>()
    for (i in nums.indices) {
        if (nums[i] > 0) {
            newArr.add(i+1)
        }
    }

    return newArr
}


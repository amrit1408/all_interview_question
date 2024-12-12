package com.itarm.allinterviewrelatedprogrammingqiestion



fun main() {
    val arr = arrayOf(-1, 0, 3, 5, 9, 12)
    var target = 0
    println(search(arr, target))

}

fun search(nums: Array<Int>, target: Int): Int {
    var low = 0
    var high = nums.size - 1
    while (low <= high) {
        val mid = low + (high - low) / 2

        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> low = mid + 1
            nums[mid] > target -> high = mid - 1
        }

    }

    return -1
}
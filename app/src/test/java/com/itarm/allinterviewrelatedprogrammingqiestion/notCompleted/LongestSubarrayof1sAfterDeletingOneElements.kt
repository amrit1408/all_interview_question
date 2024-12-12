package com.itarm.allinterviewrelatedprogrammingqiestion.notCompleted

fun main() {
    val arr = arrayOf(1, 1, 0, 1)
    longestSubArrayOf1sAfterDeletingOneElements(arr)
}

fun longestSubArrayOf1sAfterDeletingOneElements(arr: Array<Int>) {
    var count = 0
    var max = 0
    var isFirst = false
    var lastIndex = 0
    for (ele in arr.indices) {
        if (arr[ele] == 0 && !isFirst) {
            isFirst = true
            lastIndex = ele
            count--
        }

        count++
    }

    println(count)
}
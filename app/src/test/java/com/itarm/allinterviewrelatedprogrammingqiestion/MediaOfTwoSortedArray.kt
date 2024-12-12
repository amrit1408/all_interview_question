package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr1 = arrayOf(1,2)
    val arr2 = arrayOf(3,4)
    println(merge(arr1, arr2))
}

fun merge(nums1: Array<Int>, nums2: Array<Int>): Double {
    var i = 0
    var j = 0
    var arr = arrayListOf<Int>()
    while (i < nums1.size && j < nums2.size) {
        if (nums1[i] <= nums2[j]) {
            arr.add(nums1[i])
            i++
        } else {
            arr.add(nums2[j])
            j++
        }
    }

    while (i < nums1.size) {
        arr.add(nums1[i])
        i++
    }

    while (j < nums2.size) {
        arr.add(nums2[j])
        j++
    }

    if (arr.size % 2 != 0) {
        val index = (arr.size - 1) / 2
        return arr[index].toDouble()
    } else {
        val index = arr.size / 2
        val sum = (arr[index] + arr[index - 1]).toDouble() / 2
        return sum

    }
}
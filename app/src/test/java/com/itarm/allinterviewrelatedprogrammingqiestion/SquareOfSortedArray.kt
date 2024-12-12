package com.itarm.allinterviewrelatedprogrammingqiestion


fun main() {
    val arr = arrayOf(-4, -1, 0, 3, 10)
    var newArr = IntArray(arr.size)
    for (i in arr.indices) {
        newArr[i] = arr[i] * arr[i]
    }
    sort(newArr)

    newArr.forEach {
        println(it)
    }

}

fun sort(nums: IntArray) {
    val n = nums.size
    for (i in n - 1 / 2 downTo 0) {
        heapify(nums, n, i)
    }

    for (i in nums.size - 1 downTo 0) {
        val temp = nums[0]
        nums[0] = nums[i]
        nums[i] = temp

        heapify(nums, i, 0)
    }
}

fun heapify(array: IntArray, n: Int, i: Int) {
    var largest = i
    val l = 2 * i + 1
    var r = 2 * i + 2

    if (l < n && array[l] > array[largest]) {
        largest = l
    }

    if (r < n && array[r] > array[largest]) {
        largest = r
    }

    if (largest != i) {
        val temp = array[i]
        array[i] = array[largest]
        array[largest] = temp

        heapify(array, n, largest)
    }
}
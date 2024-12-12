package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(3, 1, 3, 4, 3)
    val k = 6
    //println(maxNumberOfkSumPair(arr, k))
    println(maxNumberOfkSumPairUsingHashMap(arr, k))
}

//fun maxNumberOfkSumPair(nums: Array<Int>, k: Int): Int {
//    var l = 0
//    var r = nums.size - 1
//    var count = 0
//    nums.sort()
//    while (l < r) {
//        if (nums[l] + nums[r] == k) {
//            count++
//            l++
//            r--
//        } else if (k - nums[l] > nums[r]) l++
//        else r--
//    }
//    return count
//}

fun maxNumberOfkSumPairUsingHashMap(nums: Array<Int>, k: Int): Int {
    val map = HashMap<Int, Int>()
    var operation = 0
    nums.forEach { number ->
        val res = k - number
        map[res]?.let { occ ->
            operation++
            if (occ == 1) map.remove(res)
            else map[res] = occ - 1
        } ?: run {
            map[number] = map.getOrDefault(number, 0) + 1
        }
    }

    return operation
}
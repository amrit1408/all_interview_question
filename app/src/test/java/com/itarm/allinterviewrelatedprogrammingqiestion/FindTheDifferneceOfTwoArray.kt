package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val nums1 = arrayOf(1, 2, 3, 3)
    val nums2 = arrayOf(1, 1, 2, 2)
    println(findTheDifferenceOfTwoArray(nums1, nums2))
}

fun findTheDifferenceOfTwoArray(nums1: Array<Int>, nums2: Array<Int>): List<List<Int>> {
    //val hashSet = HashSet<Int>()
    val ans = arrayListOf<List<Int>>()
    val ans1 = HashSet<Int>()
    val ans2 = HashSet<Int>()
    var i = 0
    var j = 0

    while (i < nums1.size) {
        if (!nums2.contains(nums1[i])) {
            ans1.add(nums1[i])
        }
        i++
    }

    while (j < nums2.size) {
        if (!nums1.contains(nums2[j])) {
            ans2.add(nums2[j])
        }
        j++
    }
    ans.add(ans1.toList())
    ans.add(ans2.toList())
    return ans

}
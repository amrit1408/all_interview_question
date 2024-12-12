package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(-1)
    var k = 2
    rotateArray(arr,k)
}

fun rotateArray(nums: Array<Int>, k: Int) {
    val n = nums.size
    val nk = k % n

    nums.reverse()
    nums.reverse(0,nk)
    nums.reverse(nk,n)
    nums.forEach {
        println(it)
    }

}
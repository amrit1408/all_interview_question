package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(1, 1)
    println(containerWithMostWater(arr))
}

fun containerWithMostWater(height: Array<Int>): Int {
    var i = 0
    var j = height.size - 1
    var max = Integer.MIN_VALUE
    while (i < j) {
        val base = j - i
        val hight = Math.min(height[i], height[j])
        val area = hight * base
        max = Math.max(max, area)

        if (height[i] < height[j]) {
            i++
        } else {
            j--
        }
    }
//    while (i < height.size && j > i) {
//        val base = j - i
//        val hight = if (height[i] <= height[j]) height[i] else height[j]
//        val area = hight * base
//        if (max < area) {
//            max = area
//        }
//
//        if (j == i + 1){
//            j=height.size - 1
//            i++
//        }else{
//            j--
//        }
//
//
//    }

    return max
}
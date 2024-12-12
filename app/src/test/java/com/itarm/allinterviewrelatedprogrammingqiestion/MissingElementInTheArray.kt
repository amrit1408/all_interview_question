package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = mutableListOf(0,1)
    var min = arr[0]
    var max = arr[0]
    var sum = arr[0]

    for (i in 1..<arr.size) {
        min = Math.min(min, arr[i])
        max = Math.max(max, arr[i])
        sum += arr[i]
    }
    var size = arr.size
    if (size % 2 == 0) {
        size = size
    } else {
        size += 1
    }
    val nSum = (size / 2 * (min + max))
    if(nSum==sum){
        println(max+1)
    }
    val missingValue= nSum-sum
    println(missingValue)
}
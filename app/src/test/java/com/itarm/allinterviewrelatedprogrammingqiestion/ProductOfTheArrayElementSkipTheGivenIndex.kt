package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayListOf(1, 2, 3, 4)
    println(prodOfList(arr))
}

fun prodOfList(arr: ArrayList<Int>): MutableList<Int> {
    var totalProd = 1
    arr.forEach {
        totalProd *= it
    }
    val mutableList = mutableListOf<Int>()
    arr.forEach {
        mutableList.add(totalProd/it)
    }
    return  mutableList
}
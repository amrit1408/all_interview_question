package com.itarm.allinterviewrelatedprogrammingqiestion.newtork18

fun main() {
    val arr = arrayOf(1,2,)
    val n = 5
    missingNumber(arr,n)
}

fun missingNumber(arr: Array<Int>, n: Int) {
    val new = ArrayList<Int>()
    for (i in 1..n){
        if(!arr.contains(i)){
            new.add(i)
        }
    }

    println(new)
}
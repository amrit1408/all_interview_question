package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(4, 3, 2, 7, 8, 2, 3, 1)
    println(findAllDuplicateArray(arr))
}

fun findAllDuplicateArray(arr: Array<Int>):MutableList<Int> {
    val hashSet = HashSet<Int>()
    val newArr= mutableListOf<Int>()

    for(i in arr.indices){
        if(hashSet.contains(arr[i])){
            newArr.add(arr[i])
        }else{
            hashSet.add(arr[i])
        }
    }

    return newArr
}
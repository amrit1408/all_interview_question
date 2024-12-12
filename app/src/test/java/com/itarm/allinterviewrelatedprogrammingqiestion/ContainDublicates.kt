package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(1, 2, 3, 1)
    println(isContainDuplicates(arr))
}

fun isContainDuplicates(arr: Array<Int>) :Boolean{
    val hasSet = HashSet<Int>()
    for (i in arr.indices) {
        if(hasSet.contains(arr[i])){
            return true
        }else{
            hasSet.add(arr[i])
        }

    }
    return false

}
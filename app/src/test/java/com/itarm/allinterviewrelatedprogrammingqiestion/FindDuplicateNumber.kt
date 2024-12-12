package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(1, 2, 3, 1)
    println(findDuplicateNumber(arr))
}

fun findDuplicateNumber(arr: Array<Int>) :Int{
    val hasSet = HashSet<Int>()
    for (i in arr.indices) {
        if(hasSet.contains(arr[i])){
            return arr[i]
        }else{
            hasSet.add(arr[i])
        }

    }
    return 0

}
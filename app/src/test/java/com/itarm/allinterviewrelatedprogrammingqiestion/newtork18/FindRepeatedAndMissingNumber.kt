package com.itarm.allinterviewrelatedprogrammingqiestion.newtork18

fun main() {
    val arr = arrayOf(2, 2)
    var sum = arr.size * (arr.size + 1) / 2
    var rep = 0
    var hasSet = HashSet<Int>()
    for (i in arr) {
        if (hasSet.contains(i)) {
            rep = i
        }else{
            sum -= i
        }
        hasSet.add(i)
    }

    println("$rep $sum")
}
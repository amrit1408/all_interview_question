package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str = "erase*****"
    println(removingStarFromTheString(str))
}

fun removingStarFromTheString(s: String): String {
    var newStr = StringBuilder()
    for (i in s) {
        newStr.append(i)
        if (newStr.isNotEmpty() && newStr.last() == '*') {
            newStr.deleteAt(newStr.lastIndex)
            newStr.deleteAt(newStr.lastIndex)

        }
    }
    return newStr.toString()
}
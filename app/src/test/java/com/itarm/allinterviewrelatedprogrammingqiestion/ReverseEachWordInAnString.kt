package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    var str = "My name is Amrit"
    println(reversedEachWord(str))
}

fun reversedEachWord(str: String): String {
    var newStr = ""
    val arr = str.split(" ")
    println(arr)
    for (i in arr.indices) {
        newStr += "${reverseStr(arr[i])} "
    }
    return newStr
}

fun reverseStr(str: String): String {
    var newStr = str.toCharArray()
    var l = 0
    var r = newStr.size - 1
    while (l < r) {
        val temp = newStr[l]
        newStr[l] = newStr[r]
        newStr[r] = temp
        l++
        r--
    }
    return String(newStr)
}
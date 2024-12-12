package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str1 = "leetcode"
    val str2 = "leeto"

    println(findFirstOccurrenceOfString(str1, str2))
}

fun findFirstOccurrenceOfString(haystack: String, needle: String):Int {
    var str: StringBuilder = StringBuilder()
    for (s1 in haystack) {
        str.append(s1)
        if (str.contains(needle)) {
            return str.length-needle.length
        }
    }
    return -1
}
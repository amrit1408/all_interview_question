package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val s = "   fly me   to   the moon  "
    println(findLengthOfLastWord(s))
    println(findLengthOfLastWordV2(s))
}

fun findLengthOfLastWordV2(s: String): Int {
    val n = s.length
    var endSpace = s[n - 1] == ' '
    var len = 0
    for (i in n - 1 downTo 0) {
        if (s[i] == ' ') {
            if (endSpace) continue
            else return len
        }
        if (s[i] != ' ' && endSpace) endSpace = false
        len++
    }
    return len
}

fun findLengthOfLastWord(s: String): Int {
    val newArray = s.trim().split(" ")
    return newArray.last().length
}
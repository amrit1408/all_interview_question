package com.itarm.allinterviewrelatedprogrammingqiestion.notCompleted

fun main() {
    val str = "abciiidef"
    val k = 3
    println(maxNumOfVowelsSubString(str, k))
}

fun maxNumOfVowelsSubString(s: String, k: Int): Int {
    val newStr = StringBuilder()
    var max = 0
    var count = 0
    for (i in 0..<k) {
        newStr.append(s[i])
        if (checkVowels(s[i])) count++
    }
    max = count
    var startIndex = 0
    var endIndex = k

    while (endIndex < s.length) {
        if (count != 0 && checkVowels(newStr[startIndex])) count -= 1
        newStr.deleteCharAt(startIndex)
        newStr.append(s[endIndex])
        if (checkVowels(s[endIndex])) count += 1
        endIndex++

        max = Math.max(max, count)
    }
    return max
}

fun checkVowels(ch: Char): Boolean {
    return when (ch) {
        'i', 'a', 'e', 'o', 'u' -> true
        else -> false
    }
}
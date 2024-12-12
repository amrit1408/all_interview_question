package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val strArr = arrayOf("flower", "flow", "flight")
    longestCommonPrefix(strArr)

}

fun longestCommonPrefix(strs: Array<String>):String {
    var max = Integer.MAX_VALUE
    var minWord = ""
    for (i in strs) {
        if (max > i.length) {
            max = i.length
            minWord = i
        }
    }
    var l = minWord.length


    while (l > 0) {
        for (i in strs) {
            if (!i.contains(minWord)) {
                minWord = minWord.removeRange(minWord.length - 1, minWord.length)
            }
        }

        l--
    }

    return minWord
}
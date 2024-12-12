package com.itarm.allinterviewrelatedprogrammingqiestion.infosys

fun main() {
    val str1 = "listen"
    val str2 = "silent"
    println(isAnagram(str1, str2))
    println(isAnagram2(str1, str2))
}

fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length == str2.length) {
        for (s in str1) {
            if (!str2.contains(s)) {
                return false
            }
        }

        return true
    }

    return false
}

fun isAnagram2(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val arr = IntArray(26)
    for (i in str1.indices) {
        arr[str1[i] - 'a']++
        arr[str2[i] - 'a']--
    }

    for (i in arr) {
        if (i != 0) {
            return false
        }
    }

    return true
}

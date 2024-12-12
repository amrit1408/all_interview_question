package com.itarm.allinterviewrelatedprogrammingqiestion

import java.sql.Array

fun main() {
    val word1 = "abc"
    val word2 = "bca"
    //println(isTwoStringIsClose(word1, word2))
    println(isTwoStringIsCloseV2(word1, word2))
}

fun isTwoStringIsCloseV2(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false
    val na1 = IntArray(26)
    val na2 = IntArray(26)
    var i = 0
    var j = 0
    while (i < word1.length) {
        na1[word1[i] - 'a']++
        na2[word2[i] - 'a']++
        i++
    }

    while (j < 26) {
        if (na1[j] > 0 && !(na2[j]>0)) {
            return false
        }
        j++
    }
    na1.sort()
    na2.sort()

    return na1.contentEquals(na2)
}

fun isTwoStringIsClose(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false
    val map1 = HashMap<Char, Int>()
    val map2 = HashMap<Char, Int>()
    val hashSetForKey = HashSet<Char>()
    val arr1 = arrayListOf<Int>()
    val arr2 = arrayListOf<Int>()
    var i = 0
    while (i < word1.length) {
        map1[word1[i]] = map1.getOrDefault(word1[i], 0) + 1
        map2[word2[i]] = map2.getOrDefault(word2[i], 0) + 1
        i++
    }
    println(map1)
    println(map2)
    map1.forEach {
        hashSetForKey.add(it.key)
        arr1.add(it.value)
    }

    map2.forEach {
        if (!hashSetForKey.contains(it.key)) return false
        arr2.add(it.value)
    }
    arr1.sort()
    arr2.sort()

    return arr1 == arr2
}
package com.itarm.allinterviewrelatedprogrammingqiestion

import kotlin.math.max

fun main() {
    val string = "abcabcbb"
    println(longestSubStringCharacter(string))
}

fun longestSubStringCharacter(str: String):Int {
    val set = HashSet<Char>()
    var max = 0
    var left = 0

    for(right in str.indices) {
        while (!set.add(str[right])){
            set.remove(str[left++])
        }
        max= max(max,right-left+1)
    }
    return max
}
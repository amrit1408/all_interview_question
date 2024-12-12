package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str = "cbbd"
    println(longestPalindromeSubstring(str))
}

//Not complete
fun longestPalindromeSubstring(s: String): String {
    val arr = arrayListOf<String>()
    var str = ""
    var l = 0
    var r = s.length - 1
    while (l < r)
        if (s[l] == s[r]) {

        }
    return arr.last()

}
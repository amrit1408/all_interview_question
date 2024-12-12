package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str = "hello"
    println(isPalindrome(str))
    println(isPalindrome(1213))
    println(isPalindromeUsingRecursion(1221))
}

fun isPalindrome(str: String): Boolean {
    if (str.isEmpty() || str.length == 1) {
        return true
    }
    var i = 0
    var j = str.length - 1
    while (i < str.length / 2) {
        if (str[i] == str[j]) {
            i++
            j--
        } else {
            return false
        }
    }

    return true
}

fun isPalindrome(num: Int): Boolean {
    if (num < 0) return false
    var original = num
    var reversed = 0
    while (original != 0) {
        var digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }

    return reversed == num
}

//using recursion

fun isPalindromeUsingRecursion(num: Int): Boolean {
    if (num < 0) return false
    val reverse = palindrome(num, 0)
    return num == reverse
}

fun palindrome(num: Int, temp: Int): Int {
    if (num == 0) return temp
    val newTemp = (temp * 10) + (num % 10)
    return palindrome(num / 10, newTemp)
}
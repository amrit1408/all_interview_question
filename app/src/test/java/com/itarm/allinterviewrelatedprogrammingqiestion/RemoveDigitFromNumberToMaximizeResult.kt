package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str =
        "2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471"
    val digit = "3"
    println(removeDigitFromNumberToMaximizeResult(str, digit))
}

fun removeDigitFromNumberToMaximizeResult(number: String, digit: String): String {
    var arr = ArrayList<String>()
    for (i in number.indices) {
        if (number[i].toString() == digit) {
            val num = number.substring(0, i) + number.substring(i + 1)
            arr.add(num)
        }
    }
    arr.sort()
    return arr.last()
}
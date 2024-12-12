package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str = "zbax"
    val k = 2
    println(sumOfTheStringAfterConverting(str, k))
    //sumOfTheStringAfterConverting(str, k)
}

fun sumOfTheStringAfterConverting(s: String, k: Int): Int {
    val arr = IntArray(26)
    var i = 0
    while (i < s.length) {
        arr[s[i] - 'a']++
        i++
    }
    var num = ""
    arr.forEachIndexed { index, i ->
        if (i != 0) {
            num += repeatedNum(index + 1, i)
        }

    }

    return sumOfNum(num, k)

}

fun repeatedNum(num: Int, rep: Int): String {
    var i = 0
    var newNum = ""
    while (i < rep) {
        newNum += num
        i++
    }

    return newNum
}

fun sumOfNum(s: String, k: Int): Int {
    var newStr = s
    var i = 0
    var sum = 0
    while (i < k) {
        for (j in newStr) {
            sum += j.digitToInt()
        }
        newStr = sum.toString()
        sum = 0
        i++
    }
    return newStr.toInt()
}
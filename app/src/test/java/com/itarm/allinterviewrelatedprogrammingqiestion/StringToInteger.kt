package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str = "-042"
    println(myAtoi(str))

}

fun myAtoi(s: String): Int {
    if (s == " ") return 0
    var min = Int.MIN_VALUE / 10
    var max = Int.MAX_VALUE / 10
    var digit = 0
    var isMins = 1
    var isFirstTime = false
    var i = 0
    while (i < s.length) {
        when (s[i]) {
            ' ' -> continue
            '-'->""
        }
    }
//    for (i in s) {
//        when (i) {
//            ' ' -> continue
//            '-' -> {
//                if (isFirstTime) return digit
//                if (digit == 0) {
//                    isMins = -1
//                } else {
//                    return digit * isMins
//                }
//            }
//
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
//                isFirstTime = true
//                if(digit>max || digit==max ) return digit
//                if(digit<mi)
//                digit = digit * 10 + i.toString().toInt()
//            }
//
//            else -> break
//        }
//    }
    return digit * isMins
}
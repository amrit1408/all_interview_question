package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val romanString = "MCMXC"
    val result = convertRomanToInt(romanString)
    println(result)
}

fun convertRomanToInt(roman: String): Int {
    var total = 0
    var i = 0

    while (i < roman.length) {
        val s1 = NumSymbol.get(roman[i].toString())
        if (i + 1 < roman.length) {
            val s2 = NumSymbol.get(roman[i + 1].toString())
            if (s1 >= s2) {
                total += s1
                i++
            } else {
                val new = s2 - s1
                total += new
                i += 2
            }
        } else {
            total += s1
            i++
        }
    }

    return total
}

enum class NumSymbol {
    I, V, X, L, C, D, M;

    companion object {
        fun get(roman: String): Int {
            return when (roman) {
                I.roman -> 1
                V.roman -> 5
                X.roman -> 10
                L.roman -> 50
                C.roman -> 100
                D.roman -> 500
                else -> 1000
            }
        }
    }

    val roman: String
        get() =
            when (this) {
                I -> "I"
                V -> "V"
                X -> "X"
                L -> "L"
                C -> "C"
                D -> "D"
                M -> "M"
            }

}
package com.itarm.allinterviewrelatedprogrammingqiestion


fun main() {
    val string = "PAYPALISHIRING"
    val row = 3
    println(zigZagConversion(string, row))
}

fun zigZagConversion(s: String, numRows: Int): String {
    if (numRows == 1 || numRows >= s.length) {
        return s
    }

    var index = 0
    var d = 1
    val rowsChar: Array<ArrayList<Char>> = Array(numRows) { ArrayList() }
    for (i in 0..<numRows) {
        rowsChar[i] = ArrayList()
    }

    for (i in s) {
        rowsChar[index].add(i)
        if (index == 0) {
            d = 1
        } else if (index == numRows - 1) {
            d = -1
        }
        index += d
    }

    val str = StringBuilder()
    for (i in rowsChar) {
        for (c in i) {
            str.append(c)
        }
    }
    return str.toString()
}
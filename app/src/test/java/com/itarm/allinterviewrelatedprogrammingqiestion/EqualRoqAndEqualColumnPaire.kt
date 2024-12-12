package com.itarm.allinterviewrelatedprogrammingqiestion

import java.lang.StringBuilder


fun main() {
    val arr =
        arrayOf(arrayOf(3, 1, 2, 2), arrayOf(1, 4, 4, 5), arrayOf(2, 4, 2, 2), arrayOf(2, 4, 2, 2))
    println(equalRowAndEqualColumnPair(arr))
}

fun equalRowAndEqualColumnPair(grid: Array<Array<Int>>): Int {
    val n = grid.size
    val rowMap = HashMap<String, Int>()
    val columMap = HashMap<String, Int>()
    var i = 0
    var j = 0
    var ans = 0
    while (i < n) {
        var key = StringBuilder()
        while (j < n) {
            key.append(grid[i][j]).append("#")
            j++
        }
        rowMap[key.toString()] = rowMap.getOrDefault(key.toString(), 0) + 1
        i++
        j = 0
    }
    i = 0
    j = 0
    while (j < n) {
        var key = StringBuilder()
        while (i < n) {
            key.append(grid[i][j]).append("#")
            i++
        }
        columMap[key.toString()] = columMap.getOrDefault(key.toString(), 0) + 1
        j++
        i = 0
    }
//    println(rowMap)
//    println(columMap)

    rowMap.forEach {
        if (columMap.containsKey(it.key)) {
            ans += it.value * columMap.getValue(it.key)
        }
    }
    return ans
}
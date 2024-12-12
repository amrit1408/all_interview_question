package com.itarm.allinterviewrelatedprogrammingqiestion

import androidx.core.text.isDigitsOnly


fun main() {
    //val str = "100[leetcode]"
    val str = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef"
    println(decodeStr(str))
}

fun decodeStr(s: String): String {
    var arr = arrayListOf<String>()
    var newStr = ""
    for (i in s) {
        arr.add(i.toString())
        if (arr.isNotEmpty() && arr.last() == "]") {
            peakOpenBracket(arr) { str, rep, newArr ->
                arr = repeated(newArr, str, rep)
            }
        }
    }
    println(arr)
    arr.forEach {
        newStr += it
    }
    return newStr
}

fun peakOpenBracket(arr: ArrayList<String>, callBack: (String, Int, ArrayList<String>) -> Unit) {
    var s = ""
    var n = arr.size - 1
    while (n > 0) {
        when {
            arr[n] == "[" -> {
                arr.removeAt(n)
                n--
                break
            }

            arr[n] == "]" -> {
                arr.removeAt(n)
            }

            else -> {
                s += arr[n]
                arr.removeAt(n)
            }
        }
        n--
    }

    var rep = ""
    while (n >= 0) {
        if (arr[n].all { it.isDigit() }) {
            rep = arr[n] + rep
            arr.remove(arr[n])
        }else{
            break
        }
        n--
    }

    val l = rep.toInt()
    return callBack(s.reversed(), l, arr)
}

fun repeated(arr: ArrayList<String>, s: String, k: Int): ArrayList<String> {
    var i = 0
    while (i < k) {
        arr.add(s)
        i++
    }
    return arr
}

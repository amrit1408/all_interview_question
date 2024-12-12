package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str = "[([]])"
    println(isBalanced(str))

}

fun isBalanced(str: String): Boolean {
    val list = mutableListOf<Char>()
    str.forEach {
        println(it)
        if (list.isNotEmpty()) {
            if (list.last() == '(' && it == ')' || list.last() == '{' && it == '}' || list.last() == '[' && it == ']') {
                list.removeLast()
            } else {
                list.add(it)
            }
        } else {
            list.add(it)
        }

    }

    return list.size == 0
}
package com.itarm.allinterviewrelatedprogrammingqiestion.infosys

fun main() {
    val str = "my name is amrit"
    println(createString(str))
    println(createString2(str))

}

fun createString(str: String): String {
    return str.split(" ").joinToString(" ") {
        it.capitalize()
    }
}

fun createString2(str: String): String {
    val word = str.split(" ")
    val strBuilder = StringBuilder()
    for (s in word) {
        val firstChar = if (s[0] in 'a'..'z') {
            (s[0] - 32)
        } else {
            s[0]
        }

        strBuilder.append(firstChar).append(s.substring(1)).append(" ")
    }
    return strBuilder.toString()
}
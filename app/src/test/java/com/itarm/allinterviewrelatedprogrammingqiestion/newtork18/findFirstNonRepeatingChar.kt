package com.itarm.allinterviewrelatedprogrammingqiestion.newtork18

fun main() {
    val str = "my name is Amrit"
    println(firstNonRepeatedChar(str))
    println(repeatedChar(str))
    println(reverseOfString(str))

}

fun firstNonRepeatedChar(str: String): Char {
    val hashMap = HashMap<Char, Int>()
    str.forEach {
        hashMap[it] = hashMap.getOrDefault(it, 0) + 1
    }

    str.forEach {
        if (hashMap.getValue(it) == 1) {
            return it
        }
    }
    return '_'
}

fun repeatedChar(str: String): ArrayList<Char> {
    val hashMap = HashSet<Char>()
    val repArr = ArrayList<Char>()
    str.forEach {
        if (hashMap.contains(it)) {
            repArr.add(it)
        }
        hashMap.add(it)
    }
    return repArr
}

fun reverseOfString(string: String): String {
    var str = string.toCharArray()
    var i = 0
    var j = str.size - 1

    while (i < j) {
        val tep = str[i]
        str[i] = str[j]
        str[j] = tep
        i++
        j--
    }

    return String(str)
}
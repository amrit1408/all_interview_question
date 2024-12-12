package com.itarm.allinterviewrelatedprogrammingqiestion.newtork18

fun main() {
    val str = "my name is amrit"
    newString(str)
}

fun newString(string: String){
    val strAr=string.split(" ")
    val newStr=StringBuilder()
    for (i in strAr){
        val str=i.toCharArray()
        str[0]=str[0]-32
        newStr.append(String(str)+" ")
    }
    println(newStr)
}
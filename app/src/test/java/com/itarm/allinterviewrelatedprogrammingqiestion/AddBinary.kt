package com.itarm.allinterviewrelatedprogrammingqiestion


import kotlin.text.StringBuilder

fun main() {
    val a = "11"
    val b = "1001"
//    val sum = convertBinaryToNum(a) + convertBinaryToNum(b)
//    println(convertNumberToBinary(sum))
    println(addBinary(a, b))
}

fun addBinary(a: String, b: String): String {
    var n1 = a.length - 1
    var n2 = b.length - 1
    val str = StringBuilder()
    var carry = 0
    while (0 <= n1 && 0 <= n2) {
        if (a[n1] == '1' && b[n2] == '1') {
            if (carry != 0) {
                str.append(1)
            } else {
                str.append(0)
            }
            carry = 1
        } else if (a[n1].toString() == "0" && b[n2].toString() == "1" || a[n1].toString() == "1" && b[n2].toString() == "0") {
            if (carry != 1) {
                str.append(1)
            } else {
                str.append(0)
                carry = 1
            }
        } else {
            if (carry == 1) {
                str.append(1)
                carry = 0
            } else {
                str.append(0)
            }
        }

        n1--
        n2--
    }


    while (0 <= n1 || 0 <= n2) {
        if (carry != 1) {
            if (n1 >= 0) str.append(a[n1]) else str.append(b[n2])
        } else {
            if (n1 >= 0) {
                if (a[n1] == '1') {
                    str.append(0)
                    carry = 1
                } else {
                    str.append(carry)
                    carry=0
                }
            } else {
                if (b[n2] == '1') {
                    str.append(0)
                    carry = 1
                } else {
                    str.append(carry)
                    carry=0
                }
            }
        }
        n1--
        n2--
    }
    if (carry == 1) str.append(carry)
    return str.toString().reversed()
}

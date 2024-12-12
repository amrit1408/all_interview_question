package com.itarm.allinterviewrelatedprogrammingqiestion.notCompleted

fun main() {
    val arr = arrayOf(-2,-2,2,-2)
    asteroidCollision(arr).forEach {
        println(it)
    }

    //println(asteroidCollision(arr))
}

fun asteroidCollision(asteroids: Array<Int>): IntArray {
    var arr = arrayListOf<Int>()
    for (i in asteroids) {
        arr.add(i)
        if (arr.isNotEmpty() && arr.size > 1) {
            if (arr.last() < 0 ) {
                arr = checkAsteroid(arr)
            }
        }

    }
    val newArr = IntArray(arr.size)
    var i = 0
    while (i < arr.size) {
        newArr[i] = arr[i]
        i++
    }
    return newArr
}

fun checkAsteroid(arr: ArrayList<Int>): ArrayList<Int> {
    var n = arr.size - 1
    while (n > 0) {
        if (arr[n] < 0 && arr[n - 1] < 0) {
            break
        }
        if (arr[n] < 0 && arr[n] + arr[n - 1] == 0) {
            arr.remove(arr.last())
            arr.remove(arr.last())
            break
        }
        if (arr[n] < 0 && arr[n] + arr[n - 1] < 0) {
            arr.removeAt(n - 1)
        } else {
            arr.removeAt(n)
            break
        }
        n--
    }
    return arr
}
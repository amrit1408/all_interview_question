package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val num = 5
   // trianglePyramid(num)
    reverseTrianglePyramid(num)
}

fun trianglePyramid(num: Int) {
    for(i in 1..num){
        for(j in 1..num-i){
            print("  ")
        }
        for(k in 0..<2*i-1){
            print("* ")
        }
        println()
    }
}

fun reverseTrianglePyramid(num: Int){
    for(i in 1..num){
        for(j in 1..<i){
            print("  ")
        }

        for(k in 1..num){
            print("* ")
        }
        println()
    }

}
package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val arr = arrayOf(3,4,2,3,4,7)
    println(minimumConsecutiveCardToPickUp(arr))
}

fun minimumConsecutiveCardToPickUp(cards: Array<Int>): Int {
    val hashMap = HashMap<Int, Int>()
    var min = Integer.MAX_VALUE
    for (i in cards.indices) {
        if (hashMap.containsKey(cards[i])) {
            min = Math.min(i- hashMap.get(cards[i])!! +1,min)
        }
        hashMap[cards[i]] = i
    }

    return if (min == Int.MAX_VALUE) -1 else min

}

//fun minimumConsecutiveCardToPickUp(cards: Array<Int>): Int {
//    var i = 0
//    var j = 0
//    val l = cards.size
//    val arr = arrayListOf<Int>()
//    var num = cards[i]
//    var min = Integer.MAX_VALUE
//    while (l > i && l > j) {
//        if (arr.isNotEmpty() && arr.contains(cards[i])) {
//            arr.add(cards[i])
//            println(arr)
//            if (arr.size < min) {
//                min = arr.size
//            }
//            arr.clear()
//            j++
//            i = j
//        } else {
//            arr.add(cards[i])
//            i++
//        }
//    }
//
//    return if (min == Integer.MAX_VALUE) -1 else min
//
//}
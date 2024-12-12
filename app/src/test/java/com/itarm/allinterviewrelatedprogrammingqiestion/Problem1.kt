package com.itarm.allinterviewrelatedprogrammingqiestion

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.util.Arrays

fun main() {
    var nums = arrayOf(1, 1, 1, 2, 2, 3, 3, 3, 4)
    find3(nums)
    // fin2(nums)
//    var count = 0
//    var lastNum = Int.MIN_VALUE
//    var numOfZeros = 0
//    for (i in nums.indices) {
//        if (lastNum == nums[i] && count < 2) {
//            lastNum = nums[i]
//            count++
//        } else if (lastNum != nums[i] && count < 2) {
//            lastNum = nums[i]
//            count = 0
//            count++
//        } else {
//            count = 0
//            numOfZeros++
//            nums[i] = 0
//        }
//    }
//    println(Arrays.toString(nums))
//    nums.sort()
//    println(Arrays.toString(nums.copyOfRange(numOfZeros, nums.size)))
//    println(nums.size - numOfZeros)


}

fun find3(nums: Array<Int>) {
    var count = 0
    var numsOfZero = 0
    var lastNum = Int.MIN_VALUE
    for (i in nums.indices) {
        if (i + 1 < nums.size && nums[i] == -1) {
            println("${Arrays.toString(nums)}, count:- $count line:- 1")
            swap2(i, nums)
        } else if (count < 2 && nums[i] != lastNum) {
            count = 0
            lastNum = nums[i]
            count++
            println("${Arrays.toString(nums)}, count:- $count line:- 2")
        } else if (lastNum == nums[i] && count < 2) {
            count++
            println("${Arrays.toString(nums)}, count:- $count line:- 3")
        } else if (lastNum == nums[i] && count >= 2) {
            nums[i] = -1
            numsOfZero++
            swap2(i, nums)

//            count = 0
//            if (i + 1 < nums.size) {
//                if (nums[i + 1] == lastNum) {
//                    count++
//                } else {
//                    count = 1
//                }
//
//                swap(i, i + 1, nums)
//            }

            println("${Arrays.toString(nums)}, count:- $count line:- 4")

        }


    }

    println(Arrays.toString(nums))
    println(numsOfZero)
}

fun swap(a: Int, b: Int, arr: Array<Int>) {
    val temp = arr[a]
    arr[a] = arr[b]
    arr[b] = temp
}

fun swap2(a: Int, arr: Array<Int>) {
    for (i in a..arr.size - 2) {
        arr[i] = arr[i + 1]
    }
    arr[arr.size - 1] = -1

}


fun fin2(arr: Array<Int>) {
    val newArr = arrayListOf<Int>()
    var count = 0
    var lastNum = Int.MIN_VALUE
    for (i in arr) {
        if (lastNum == i && count < 2) {
            lastNum = i
            newArr.add(i)
            count++
        } else if (lastNum != i) {
            lastNum = i
            count = 0
            newArr.add(i)
            count++
        }

    }

    println(newArr)
    println(newArr.size)
}

fun find(arr: ArrayList<Int>) {
    val hashMap = hashMapOf<Int, Int>()
    val newArr = arrayListOf<Int>()
    for (i in arr) {
        hashMap[i] = hashMap.getOrDefault(hashMap[i], 0) + 1
    }

    hashMap.forEach {
        if (it.value <= 2) {
            newArr.add(it.key)
            newArr.add(it.key)
        } else {
            newArr.add(it.key)
        }
    }

    println(newArr)
    println(newArr.size)

}

fun date(){
    val arr= arrayListOf(1,2,3,4,5)
    GlobalScope.launch {
        async {
            for (i in arr){
                println()
            }
        }
    }

    suspend fun run(){

    }
}
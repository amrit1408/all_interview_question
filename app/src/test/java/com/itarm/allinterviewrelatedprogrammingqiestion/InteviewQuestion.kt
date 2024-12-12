package com.itarm.allinterviewrelatedprogrammingqiestion

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.concurrent.thread


//fun main(){
//    val arr= arrayOf("03-Jan-2018", "02-Jan-2018","04-Jan-2017")
//    val format:DateTimeFormatter= DateTimeFormatter.ofPattern("dd-MMM-yyyy")
//
//    val res= arr.sortedBy {
//        LocalDate.parse(it,format)
//    }
//
////    println(LocalDate.parse("03-Jan-2018",format))
//
//}

//fun main() {
//    runBlocking {
//        for(i in 1..100){
//            val thread1=async {
//                if(i%2==0){
//                    println("Thread1: $i")
//                }
//            }
//
//            val thread2=async {
//                if(i%2!=0){
//                    println("Thread2: $i")
//                }
//            }
//
//            thread1.await()
//            thread2.await()
//        }
//
//    }
//
//
//}


fun main() {
    val arr = arrayListOf(1, 3, 2, 5, 4, 5)
    var firstMax = Integer.MIN_VALUE
    var secondMax = Integer.MIN_VALUE
    val n=arr.size
    var i=0

    while (i<n){
        if(arr.get(i)>firstMax){
            firstMax=arr.get(i)
        }

        if(arr.get(i)>secondMax && arr.get(i)!=firstMax){
            secondMax=arr.get(i)
        }
        i++
    }


    println(secondMax)

}
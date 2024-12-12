package com.itarm.allinterviewrelatedprogrammingqiestion.infosys

fun main(){
    val str="a"
    println(isPalintrom(str));
}

fun isPalintrom(str:String):Boolean{
    var r=str.length-1
    var l=0
    while (l<r){
        if(str[l]!=str[r]){
            return false
        }
        r--
        l++
    }

    return true

}
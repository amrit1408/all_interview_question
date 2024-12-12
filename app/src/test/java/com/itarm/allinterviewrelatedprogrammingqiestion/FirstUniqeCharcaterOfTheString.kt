package com.itarm.allinterviewrelatedprogrammingqiestion

fun main() {
    val str = "leetcode"
    //println(findFirstUniqueCharacter(str))
    test(str)

}
fun test(s:String){
    val count = IntArray(26)
    for(c in s){
        count[c-'a']++
    }




}
fun findFirstUniqueCharacter(s: String):Int {
    val hashSet = HashMap<Char, Int>()
    for (str in s) {
        if (hashSet.contains(str)) {
            hashSet[str] = hashSet.getValue(str) + 1
        } else {
            hashSet[str] = 1
        }
    }

    for(i in s.toCharArray().indices){
        if(hashSet.containsKey(s[i]) && hashSet[s[i]] ==1){
            return i
        }
    }

    return -1
}
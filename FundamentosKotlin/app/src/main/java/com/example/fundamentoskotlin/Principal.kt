package com.example.fundamentoskotlin

import java.lang.Math.abs

fun main() {
    val a = 3

    var b: Int
    b = 5

    println("b = $b")

//    var objNull:Any?
//    objNull = null
//    objNull = "Hola"
    newTopic("hola kotlin!")
    println(sum(4,5))

}

fun newTopic(topic: String){
    println()
    print(" ================= $topic =================")
    println()
}

private fun sum(a:Int, b:Int):Int{
    return a+b
}

private fun sum2(a:Int,b:Int):Int = a+b

infix fun Int.enableAbs(enable: Boolean) = abs(this)
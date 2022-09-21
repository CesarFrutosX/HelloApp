package com.example.fundamentoskotlin.classes

open class Phone(val number: Int) {

    fun call(){
        println("Llamanding")
    }
    open fun showNumber(){
        println(number)
    }


}
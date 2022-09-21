package com.example.fundamentoskotlin.classes

class Smartphone(number: Int, val isPrivate: Boolean) : Phone(number) {

    override fun showNumber() {
        if (isPrivate) {
           println("Es privado")
        }
        else
            super.showNumber()
    }
}
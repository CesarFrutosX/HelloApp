package com.example.fundamentoskotlin.classes

import com.example.fundamentoskotlin.newTopic

fun main() {
    newTopic("Classes")
    val phone = Phone(699696996)
    phone.call()
    phone.showNumber()
    newTopic("Herencia")
    val smartphone = Smartphone(69696000,true)
    smartphone.call()
    smartphone.showNumber()

    //println("privado? ${smartphone.isPrivate}")
    newTopic("Data Classes")
    val myUser = User(0,"Antonio","Calabuig",Group.FAMILY.ordinal)
    println(myUser)
    val bro = myUser.copy(1,"César")
    println(bro)
    val friend = myUser.copy(2,"César", lastName = "Ferris", group = Group.FRIEND.ordinal)
    println(friend)

    newTopic("Funciones de alcance")
    with(smartphone){
        println("Privado? $isPrivate")
        call()

    }

    friend.group = Group.WORK.ordinal
    friend.name = "Lorenzo"
    friend.lastName = "Brown"
    friend.apply {
        group = Group.WORK.ordinal
        name = "Lorenzo"
        lastName = "Brown"
    }

}
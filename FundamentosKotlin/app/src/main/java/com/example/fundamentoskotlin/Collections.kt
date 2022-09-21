package com.example.fundamentoskotlin

import com.example.fundamentoskotlin.classes.Group
import com.example.fundamentoskotlin.classes.User

fun main(){
    newTopic("Collections")
    newTopic("Solo lectura")

    val fruits = listOf<Any>("Manzana","Banana","Uva", "Lima")
    println(fruits.get((0..fruits.size-1).random()))
    val myUser = User(0,"Anonio","Calabuig",Group.FAMILY.ordinal)
    val userCopu = myUser.copy()
    val user2 = myUser.copy(1,"Iván")
    val user3 = myUser.copy(2, lastName ="Ferris", group = Group.FRIEND.ordinal)

    val userList = mutableListOf<User>()
    userList.add(myUser)
    userList.add(user2)

    userList.remove(userCopu)
    println(userList)

    val userListSelected = mutableListOf<User>()
    userListSelected.add(myUser)
    userListSelected.set(0,user2)
    println(userListSelected)

    newTopic("MAPS")
    val userMap = mutableMapOf<Int,User>()

    userMap.put(myUser.id.toInt(),myUser)
    userMap.put(myUser.id.toInt(),myUser)
    userMap.put(user3.id,user3)
    userMap.remove(2)

    userMap.put(user2.id,user2)
    userMap.put(user3.id,user3)
    println(userMap)
}
package com.example.fundamentoskotlin

const val x = 1

fun main(){
    newTopic("Bucles")
    showPeople2("Antonio","Pau","David","Rubén")
}

fun showPeople(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)

}

fun showPeople2(vararg people: String){
    for (person in people){
        println(person)
    }
    var index = 0
    while(index < people.size){
        println(people[index])
        index++
    }

    index = (0..people.size-1).random()
    when(people[index]){
        "Antonio" -> println("Es antonio")
        "David" -> {
            println("Es Vadid")
            println("Ir a otra pantalla")
        }

        else -> println(people[index])
    }

}
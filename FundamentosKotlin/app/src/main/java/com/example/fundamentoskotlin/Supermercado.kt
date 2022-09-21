package com.example.fundamentoskotlin.classes

fun main() {
    val listaDeTipos = mutableListOf<String>("Roja","Fea","Fuji")
    val lista2 = listaDeTipos.toMutableList()
    lista2.set(0,"Verde")

    val manzana = Fruta(0,"Manzana",1.99f,listaDeTipos)
    val pera = manzana.copy(1,"Pera", tipos = lista2)

    val listaFrutas = mutableListOf<Fruta>(manzana,pera)
    println(listaFrutas)
}
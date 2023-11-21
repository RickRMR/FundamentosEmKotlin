package com.richard.funcoesemkotlin

class FilterMap {
}

fun main() {
    val nameList = listOf("Richard","Beatriz","Aparecida","Lorena")
    val helloName = nameList.map { "Olá $it" }
    println(helloName)
}
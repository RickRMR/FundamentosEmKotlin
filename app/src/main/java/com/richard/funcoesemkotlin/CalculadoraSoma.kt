package com.richard.funcoesemkotlin

class Calculadora {
}

fun main() {
    calculadora(9,7,::operation)
}
fun operation(calc:Int , func:Int) = println(calc + func)

fun calculadora(base: Int, conta: Int, calculo:(Int, Int)-> Unit) {
    calculo(base,conta)
}

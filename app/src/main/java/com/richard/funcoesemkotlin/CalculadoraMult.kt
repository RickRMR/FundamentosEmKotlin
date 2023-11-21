package com.richard.funcoesemkotlin

class CalculadoraMult {
}

fun main() {
    fator(9,7, ::Mult )
}
fun Mult(calc:Int , func:Int) = println(calc * func)

fun fator(base: Int, conta: Int, calculo:(Int, Int)-> Unit) {
    calculo(base,conta)
}
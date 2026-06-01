package org.example

import org.example.app.App
import org.example.app.Fecha

fun main(){
    println(App().greeting)
    val d = Fecha(29, 5, 2026)
    println(d)
}
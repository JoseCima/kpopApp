package com.example.kpopapp

class Categorias (nombrePortada:String,imagenPortada:Int, imagen:Int, descripcion:String) {

    var nombrePortada:String = ""
    var imagenPortada:Int = 0
    var descripcion:String = ""
    var imagen:Int = 0


    init {
        this.nombrePortada = nombrePortada
        this.imagenPortada = imagenPortada
        this.descripcion  =descripcion
        this.imagen = imagen
    }
}
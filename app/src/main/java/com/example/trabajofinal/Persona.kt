package com.example.trabajofinal

abstract class Persona {
    var nombre: String=""
    var apellido: String=""
    var edad: Int=0
    var dni: Int=0

    constructor(nombre: String,apellido: String,edad: Int,dni: Int){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
    }
    override fun establecerEdad(edad: Int): Int{
        return this.edad
    }
}
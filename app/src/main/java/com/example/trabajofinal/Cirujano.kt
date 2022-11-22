package com.example.trabajofinal

class Cirujano() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var operacion: String=""

    constructor(nombre: String,apellido: String,edad: Int,dni: Int,operacion: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.operacion=operacion
    }
}
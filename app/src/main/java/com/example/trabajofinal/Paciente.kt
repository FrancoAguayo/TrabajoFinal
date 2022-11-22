package com.example.trabajofinal

class Paciente() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var peso: Double=0.0
    var altura: Double=0.0
    var diagnostico: String=""

    constructor(nombre: String,apellido: String,edad: Int,dni: Int,peso: Double,altura: Double
                ,diagnostico: String): this (){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.peso=peso
        this.altura=altura
        this.diagnostico=diagnostico
    }
}
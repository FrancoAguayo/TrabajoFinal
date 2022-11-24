package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

abstract class Paciente() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var peso: Double=0.0
    var altura: Double=0.0
    var diagnostico: String=""

    constructor(parcel: Parcel) : this() {
        peso = parcel.readDouble()
        altura = parcel.readDouble()
        diagnostico = parcel.readString().toString()
    }

    override fun establecerEdad(edad: Int): Int{
        this.edad=edad
        return this.edad
    }
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

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        super.writeToParcel(parcel, flags)
        parcel.writeDouble(peso)
        parcel.writeDouble(altura)
        parcel.writeString(diagnostico)
    }

    override fun describeContents(): Int {
        return 0
    }

    }
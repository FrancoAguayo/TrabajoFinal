package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

abstract class Persona() :Funciones(), Parcelable {
    var nombre: String=""
    var apellido: String=""
    var edad: Int=0
    var dni: Int=0

    constructor(nombre: String,apellido: String,edad: Int,dni: Int) : this() {
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
    }
    override fun establecerEdad(edad: Int): Int{
        this.edad=edad
        return this.edad
    }
    constructor(parcel: Parcel) : this(){
        nombre= parcel.readString().toString()
        apellido= parcel.readString().toString()
        edad= parcel.readInt()
        dni= parcel.readInt()
    }
    override fun writeToParcel(parcel: Parcel, flags: Int){
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeInt(edad)
        parcel.writeInt(dni)
    }
}
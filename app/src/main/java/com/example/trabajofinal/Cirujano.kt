package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

data class Cirujano(var operacion: String="") : Persona(), Parcelable {

    constructor(parcel: Parcel) : this() {
        nombre = parcel.readString().toString()
        apellido = parcel.readString().toString()
        edad = parcel.readString().toString()
        dni = parcel.readString().toString()
        operacion = parcel.readString().toString()
    }

    constructor(nombre: String,apellido: String,edad: String,dni: String,operacion: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.operacion=operacion
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeString(edad)
        parcel.writeString(dni)
        parcel.writeString(operacion)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cirujano> {
        override fun createFromParcel(parcel: Parcel): Cirujano {
            return Cirujano(parcel)
        }

        override fun newArray(size: Int): Array<Cirujano?> {
            return arrayOfNulls(size)
        }
    }
}
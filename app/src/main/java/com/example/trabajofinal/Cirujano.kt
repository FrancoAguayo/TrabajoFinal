package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

class Cirujano() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var operacion: String=""

    constructor(parcel: Parcel) : this() {
        operacion = parcel.readString().toString()
    }

    constructor(nombre: String,apellido: String,edad: Int,dni: Int,operacion: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.operacion=operacion
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        super.writeToParcel(parcel, flags)
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
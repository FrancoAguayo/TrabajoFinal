package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

class Medico() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var aniosExperiencia: Int=0
    var tipoDoctorado: String=""

    constructor(parcel: Parcel) : this() {
        aniosExperiencia = parcel.readInt()
        tipoDoctorado = parcel.readString().toString()
    }

    constructor(nombre: String,apellido: String,edad: Int,dni: Int,aniosExperiencia: Int,
                tipoDoctorado: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.aniosExperiencia=aniosExperiencia
        this.tipoDoctorado=tipoDoctorado
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        super.writeToParcel(parcel, flags)
        parcel.writeInt(aniosExperiencia)
        parcel.writeString(tipoDoctorado)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Medico> {
        override fun createFromParcel(parcel: Parcel): Medico {
            return Medico(parcel)
        }

        override fun newArray(size: Int): Array<Medico?> {
            return arrayOfNulls(size)
        }
    }
}
package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

data class Medico(var aniosExperiencia: String="",var tipoDoctorado: String="") : Persona(),Parcelable {

    constructor(parcel: Parcel) : this() {
        nombre = parcel.readString().toString()
        apellido = parcel.readString().toString()
        edad = parcel.readString().toString()
        dni = parcel.readString().toString()
        aniosExperiencia = parcel.readString().toString()
        tipoDoctorado = parcel.readString().toString()
    }

    constructor(nombre: String,apellido: String,edad: String,dni: String,aniosExperiencia: String,
                tipoDoctorado: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.aniosExperiencia=aniosExperiencia
        this.tipoDoctorado=tipoDoctorado
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeString(edad)
        parcel.writeString(dni)
        parcel.writeString(aniosExperiencia)
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
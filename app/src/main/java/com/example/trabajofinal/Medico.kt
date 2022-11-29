package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

data class Medico(var aniosExperiencia: Int=0,var tipoDoctorado: String="") : Persona(),Parcelable {

    constructor(parcel: Parcel) : this() {
        aniosExperiencia = parcel.readInt()
        tipoDoctorado = parcel.readString().toString()
        nombre = parcel.readString().toString()
        apellido = parcel.readString().toString()
        edad = parcel.readString().toString()
        dni = parcel.readString().toString()
    }

    constructor(nombre: String,apellido: String,edad: String,dni: String,aniosExperiencia: Int,
                tipoDoctorado: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.aniosExperiencia=aniosExperiencia
        this.tipoDoctorado=tipoDoctorado
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(aniosExperiencia)
        parcel.writeString(tipoDoctorado)
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeString(edad)
        parcel.writeString(dni)
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
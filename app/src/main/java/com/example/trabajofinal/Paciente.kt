package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

data class Paciente(var peso: String="",var altura: String="",var diagnostico: String="") : Persona(), Parcelable {

    constructor(parcel: Parcel) : this() {
        nombre = parcel.readString().toString()
        apellido = parcel.readString().toString()
        edad = parcel.readString().toString()
        dni = parcel.readString().toString()
        peso = parcel.readString().toString()
        altura = parcel.readString().toString()
        diagnostico = parcel.readString().toString()
    }
    constructor(nombre: String,apellido: String,edad: String,dni: String,peso: String,altura: String
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
        parcel.writeString(nombre)
        parcel.writeString(apellido)
        parcel.writeString(edad)
        parcel.writeString(dni)
        parcel.writeString(peso)
        parcel.writeString(altura)
        parcel.writeString(diagnostico)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Paciente> {
        override fun createFromParcel(parcel: Parcel): Paciente {
            return Paciente(parcel)
        }

        override fun newArray(size: Int): Array<Paciente?> {
            return arrayOfNulls(size)
        }
    }

}
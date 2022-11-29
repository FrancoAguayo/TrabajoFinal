package com.example.trabajofinal

import android.os.Parcel
import android.os.Parcelable

data class Paciente(var peso: Double=0.0,var altura: Double=0.0,var diagnostico: String="") : Persona(), Parcelable {

    constructor(parcel: Parcel) : this() {
        peso = parcel.readDouble()
        altura = parcel.readDouble()
        diagnostico = parcel.readString().toString()
        nombre = parcel.readString().toString()
        apellido = parcel.readString().toString()
        edad = parcel.readString().toString()
        dni = parcel.readString().toString()
    }
    constructor(nombre: String,apellido: String,edad: String,dni: String,peso: Double,altura: Double
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
        parcel.writeDouble(peso)
        parcel.writeDouble(altura)
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
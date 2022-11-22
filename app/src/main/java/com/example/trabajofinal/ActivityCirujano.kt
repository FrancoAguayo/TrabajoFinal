package com.example.trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityCirujano : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cirujano)
        val botonResultados= findViewById<Button>(R.id.BtnNext5)
        botonResultados.setOnClickListener(){
            setData()
        }
    }
    fun setData(){
        val EtNombre= findViewById<EditText>(R.id.EtName3)
        val EtApellido= findViewById<EditText>(R.id.EtSurname3)
        val EtEdad= findViewById<EditText>(R.id.EtAge3)
        val EtDNI= findViewById<EditText>(R.id.EtNDNI3)
        val EtOperacion= findViewById<EditText>(R.id.EtSurgery)

        val ConviertoEtNombre= EtNombre.text.toString()
        val ConviertoEtApellido= EtApellido.text.toString()
        val ConviertoEtEdad= EtEdad.text.toString()
        val ConviertoEtDNI= EtDNI.text.toString()
        val ConviertoEtOperacion= EtOperacion.text.toString()

        val mostrarResultados3= Intent (this, ResultadosCirujano::class.java)
        mostrarResultados3.putExtra("1",ConviertoEtNombre)
        mostrarResultados3.putExtra("2",ConviertoEtApellido)
        mostrarResultados3.putExtra("3",ConviertoEtEdad)
        mostrarResultados3.putExtra("4",ConviertoEtDNI)
        mostrarResultados3.putExtra("5",ConviertoEtOperacion)
        startActivity(mostrarResultados3)
    }
}
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
            createCirujano()
        }
    }
    fun createCirujano(){
        val EtNombre= findViewById<EditText>(R.id.EtName3)
        val EtApellido= findViewById<EditText>(R.id.EtSurname3)
        val EtEdad= findViewById<EditText>(R.id.EtAge3)
        val EtDNI= findViewById<EditText>(R.id.EtNDNI3)
        val EtOperacion= findViewById<EditText>(R.id.EtSurgery)
        val cirujanoNuevo=Cirujano()

        cirujanoNuevo.nombre=EtNombre.text.toString()
        cirujanoNuevo.apellido=EtApellido.text.toString()
        cirujanoNuevo.edad=EtEdad.text.toString()
        cirujanoNuevo.dni=EtDNI.text.toString()
        cirujanoNuevo.operacion=EtOperacion.text.toString()

        val intent= Intent (this, ResultadosCirujano::class.java)
        intent.putExtra("cirujano",cirujanoNuevo)
        startActivity(intent)
    }
}
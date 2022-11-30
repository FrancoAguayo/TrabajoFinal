package com.example.trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityMedico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity_medico)
        val botonResultados= findViewById<Button>(R.id.BtnNext3)
        botonResultados.setOnClickListener(){
            createMedico()
        }
    }
    fun createMedico(){
        val EtNombre= findViewById<EditText>(R.id.EtName2)
        val EtApellido= findViewById<EditText>(R.id.EtSurname2)
        val EtEdad= findViewById<EditText>(R.id.EtAge2)
        val EtDNI= findViewById<EditText>(R.id.EtDNI2)
        val EtDoctorate= findViewById<EditText>(R.id.EtDoctorate)
        val EtExperience= findViewById<EditText>(R.id.EtExperience)
        val medicoNuevo=Medico()
        medicoNuevo.nombre=EtNombre.text.toString()
        medicoNuevo.apellido=EtApellido.text.toString()
        medicoNuevo.edad=EtEdad.text.toString()
        medicoNuevo.dni=EtDNI.text.toString()
        medicoNuevo.tipoDoctorado=EtDoctorate.text.toString()
        medicoNuevo.aniosExperiencia=EtExperience.text.toString()

        val intent= Intent (this, ResultadosMedico::class.java)
        intent.putExtra("medico",medicoNuevo)
        startActivity(intent)
    }
}
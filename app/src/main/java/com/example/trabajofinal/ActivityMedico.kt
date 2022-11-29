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
            setData()
        }
    }
    fun setData(){
        var medico1=Medico()
        val EtNombre= findViewById<EditText>(R.id.EtName2)
        val EtApellido= findViewById<EditText>(R.id.EtSurname2)
        val EtEdad= findViewById<EditText>(R.id.EtAge2)
        val EtDNI= findViewById<EditText>(R.id.EtDNI2)
        val EtDoctorate= findViewById<EditText>(R.id.EtDoctorate)
        val EtExperience= findViewById<EditText>(R.id.EtExperience)

        val ConviertoEtNombre= EtNombre.text.toString()
        val ConviertoEtApellido= EtApellido.text.toString()
        val ConviertoEtEdad= EtEdad.text.toString()
        val ConviertoEtDNI= EtDNI.text.toString()
        val ConviertoEtDoc= EtDoctorate.text.toString()
        val ConviertoEtEx= EtExperience.text.toString()
        //EtEdad.text=(paciente1.establecerEdad(21)).toString()

        val mostrarResultados2= Intent (this, ResultadosMedico::class.java)
        mostrarResultados2.putExtra("1",ConviertoEtNombre)
        mostrarResultados2.putExtra("2",ConviertoEtApellido)
        mostrarResultados2.putExtra("3",ConviertoEtEdad)
        mostrarResultados2.putExtra("4",ConviertoEtDNI)
        mostrarResultados2.putExtra("5",ConviertoEtDoc)
        mostrarResultados2.putExtra("6",ConviertoEtEx)
        startActivity(mostrarResultados2)
    }
}
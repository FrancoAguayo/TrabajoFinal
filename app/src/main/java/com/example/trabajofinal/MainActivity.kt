package com.example.trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonResultados= findViewById<Button>(R.id.BtnNext)
        botonResultados.setOnClickListener(){
            setData()
        }
    }
    fun setData(){
        val TvNombre= findViewById<TextView>(R.id.TvName)
        val TvApellido= findViewById<TextView>(R.id.TvSurname)
        val TvEdad= findViewById<TextView>(R.id.TvAge)
        val TvDNI= findViewById<TextView>(R.id.TvDNI)
        val TvPeso= findViewById<TextView>(R.id.TvWeight)
        val TvAltura= findViewById<TextView>(R.id.TvHeight)
        val TvDiagnostico= findViewById<TextView>(R.id.TvDiagnosis)

        val EtNombre= findViewById<EditText>(R.id.EtName)
        val EtApellido= findViewById<EditText>(R.id.EtSurname)
        val EtEdad= findViewById<EditText>(R.id.EtAge)
        val EtDNI= findViewById<EditText>(R.id.EtNDNI)
        val EtPeso= findViewById<EditText>(R.id.EtWeight)
        val EtAltura= findViewById<EditText>(R.id.EtHeight)
        val EtDiagnostico= findViewById<EditText>(R.id.EtDiagnosis)

        val ConviertoEtNombre= EtNombre.text.toString()
        val ConviertoEtApellido= EtApellido.text.toString()
        val ConviertoEtEdad= EtEdad.text.toString()
        val ConviertoEtDNI= EtDNI.text.toString()
        val ConviertoEtPeso= EtPeso.text.toString()
        val ConviertoEtAltura= EtAltura.text.toString()
        val ConviertoEtDiagnostico= EtDiagnostico.text.toString()
        val mostrarResultados= Intent (this, ResultadosPaciente::class.java)
        mostrarResultados.putExtra("1",ConviertoEtNombre)
        mostrarResultados.putExtra("2",ConviertoEtApellido)
        mostrarResultados.putExtra("3",ConviertoEtEdad)
        mostrarResultados.putExtra("4",ConviertoEtDNI)
        mostrarResultados.putExtra("5",ConviertoEtPeso)
        mostrarResultados.putExtra("6",ConviertoEtAltura)
        mostrarResultados.putExtra("7",ConviertoEtDiagnostico)
        startActivity(mostrarResultados)
    }
}
package com.example.trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
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
    val botonResultados= findViewById<Button>(R.id.BtnNext)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botonResultados.setOnClickListener(){
            //createPaciente()
        }
    }
    fun createPaciente(){
        val pacienteNuevo=Paciente()
        pacienteNuevo.nombre=EtNombre.text.toString()
        pacienteNuevo.apellido=EtApellido.text.toString()
        pacienteNuevo.edad=EtEdad.text.toString()
        pacienteNuevo.dni=EtDNI.text.toString()
        pacienteNuevo.diagnostico=EtDiagnostico.text.toString()

        val intent= Intent(this,ResultadosPaciente::class.java)
        intent.putExtra("paciente",pacienteNuevo)
        startActivity(intent)
    }
}

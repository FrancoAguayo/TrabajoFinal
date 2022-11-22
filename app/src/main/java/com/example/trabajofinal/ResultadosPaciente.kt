package com.example.trabajofinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadosPaciente : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_paciente)
        val bundle = intent.extras
        val dato1 =bundle?.getString("1")
        val dato2 =bundle?.getString("2")
        val dato3 =bundle?.getString("3")
        val dato4 =bundle?.getString("4")
        val dato5 =bundle?.getString("5")
        val dato6 =bundle?.getString("6")
        val dato7 =bundle?.getString("7")
        val Infrome =findViewById<TextView>(R.id.TvInforme)
        val botonSalir= findViewById<Button>(R.id.BtnNext2)
        Infrome.text="El/La paciente se llama ${dato1} ${dato2}. Tiene ${dato3} años de edad y su" +
                " DNI es ${dato4}; tiene un peso ${dato5} kg y mide ${dato6} metros de altura." +
                " Se lo/a ha diagnosticado con ${dato7} y se encuentra atendido/a."
        botonSalir.setOnClickListener{
            val avanzar= Intent (this, ActivityMedico::class.java)
            startActivity(avanzar)
        }
    }
}
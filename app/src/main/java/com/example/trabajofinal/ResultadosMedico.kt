package com.example.trabajofinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadosMedico : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_medico)
        val bundle = intent.extras
        val dato1=bundle?.getString("1")
        val dato2=bundle?.getString("2")
        val dato3=bundle?.getString("3")
        val dato4=bundle?.getString("4")
        val dato5=bundle?.getString("5")
        val dato6=bundle?.getString("6")
        val Infrome =findViewById<TextView>(R.id.TvInforme2)
        val botonAvanzar= findViewById<Button>(R.id.BtnNext4)
        Infrome.text="El/La doctor(a) se llama ${dato1} ${dato2}.Tiene ${dato3} años de edad y su" +
                " DNI es ${dato4}; su carrera como profesional en medicina tiene ${dato5} años de experiencia" +
                " hasta la fecha con un titulo en ${dato6}. Actualmente se está alistando para atender a todo" +
                " paciente que se le asigne."
        botonAvanzar.setOnClickListener{
            val avanzar= Intent (this, ActivityMedico::class.java)
            startActivity(avanzar)
        }
    }
}
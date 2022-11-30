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
        val informe =findViewById<TextView>(R.id.TvInforme)
        val botonSalir= findViewById<Button>(R.id.BtnNext2)
        val pacienteRecibido=intent.getParcelableExtra<Paciente>("paciente")

        if(pacienteRecibido!=null){
            informe.text="El/La paciente se llama ${pacienteRecibido.nombre}" +
                    " ${pacienteRecibido.apellido}. Tiene ${pacienteRecibido.edad} años de edad y su" +
                    " DNI es ${pacienteRecibido.dni}; tiene un peso de ${pacienteRecibido.peso} kg y mide" +
                    " ${pacienteRecibido.altura}  metros de altura." +
                    " Se lo/a ha diagnosticado con ${pacienteRecibido.diagnostico} y se encuentra atendido/a."
        }
        botonSalir.setOnClickListener{
            val avanzar= Intent (this, ActivityMedico::class.java)
            startActivity(avanzar)
        }

    }
}
package com.example.trabajofinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

lateinit var service: ApiService
val TAG_LOGS = "Alumno Franco"

class ResultadosMedico : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_medico)
        val informe =findViewById<TextView>(R.id.TvInforme2)
        val botonAvanzar= findViewById<Button>(R.id.BtnYes)
        val botonRetroceder= findViewById<Button>(R.id.BtnNo)
        val medicoRecibido=intent.getParcelableExtra<Medico>("medico")
        val btnBucsar = findViewById<Button>(R.id.btnBuscar)
        if(medicoRecibido!=null){
            informe.text="El/La doctor(a) se llama ${medicoRecibido.nombre} ${medicoRecibido.apellido}." +
                    " Tiene ${medicoRecibido.edad} años de edad y su DNI es ${medicoRecibido.dni};" +
                    " su carrera como profesional en medicina tiene ${medicoRecibido.aniosExperiencia} años de experiencia" +
                    " hasta la fecha con un titulo en ${medicoRecibido.tipoDoctorado}. Actualmente se está alistando para atender a todo" +
                    " paciente que se le asigne."
        }
        botonAvanzar.setOnClickListener{
            val avanzar= Intent (this, ResultadosFinales::class.java)
            startActivity(avanzar)
        }
        botonRetroceder.setOnClickListener{
            finish()
        }
    }
}
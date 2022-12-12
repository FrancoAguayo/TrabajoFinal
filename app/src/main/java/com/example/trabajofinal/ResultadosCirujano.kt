package com.example.trabajofinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadosCirujano : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados_cirujano)
        val informe =findViewById<TextView>(R.id.TvInforme3)
        val botonAvanzar= findViewById<Button>(R.id.BtnNext6)
        val agradecimiento= findViewById<TextView>(R.id.TvThanks)
        informe.text="¡Listo! El paciente ya se encuentra atendido."
        agradecimiento.text= "Muchas gracias por usar esta aplicacion. Vuelva pronto."
        botonAvanzar.setOnClickListener{
            finishAffinity()
        }
    }
}
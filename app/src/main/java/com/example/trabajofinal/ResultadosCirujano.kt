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
        val bundle = intent.extras
        val dato1=bundle?.getString("1")
        val dato2=bundle?.getString("2")
        val dato3=bundle?.getString("3")
        val dato4=bundle?.getString("4")
        val dato5=bundle?.getString("5")
        val Infrome =findViewById<TextView>(R.id.TvInforme3)
        val agradecimiento= findViewById<TextView>(R.id.TvThanks)
        val botonAvanzar= findViewById<Button>(R.id.BtnNext6)
        Infrome.text="El/La cirujano(a) se llama ${dato1} ${dato2}.Tiene ${dato3} años de edad y su" +
                " DNI es ${dato4}; Está especializado en hacer operación de ${dato5} y está disponible para" +
                " hacer una de éstas cuando sea necesario."
        agradecimiento.text= "Muchas gracias por usar esta aplicacion. Vuelva pronto."
        botonAvanzar.setOnClickListener{
            finishAffinity()
        }
    }
}
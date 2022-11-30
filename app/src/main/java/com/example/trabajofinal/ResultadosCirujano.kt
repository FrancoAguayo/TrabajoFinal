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
        val cirujanoRecibido=intent.getParcelableExtra<Cirujano>("cirujano")
        if(cirujanoRecibido!=null){
            informe.text="El/La cirujano(a) se llama ${cirujanoRecibido.nombre} ${cirujanoRecibido.apellido}." +
                    " Tiene ${cirujanoRecibido.edad} años de edad y su DNI es ${cirujanoRecibido.dni};" +
                    " Está especializado en hacer operación de ${cirujanoRecibido.operacion} y está disponible para" +
                    " hacer una de éstas cuando sea necesario."
        }
        agradecimiento.text= "Muchas gracias por usar esta aplicacion. Vuelva pronto."
        botonAvanzar.setOnClickListener{
            finishAffinity()
        }
    }
}
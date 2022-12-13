package com.example.trabajofinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.squareup.picasso.Picasso

class ActivityMedico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity_medico)
        val IvDoctor= findViewById<ImageView>(R.id.IvDoctor)
        val url="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_8kccb13Bzdj7Zos3tLkOudE2XprUt8NMApOGjLm7RmD3Swg_46H_fmktB4YkZzACaTQ&usqp=CAU"
        Picasso.get()
            .load(url)
            .resize(50,50)
            .centerCrop()
            .into(IvDoctor)
        val botonResultados= findViewById<Button>(R.id.BtnNext3)
        botonResultados.setOnClickListener(){
            createMedico()
        }
    }
    fun createMedico(){
        val RbRoberto = findViewById<RadioButton>(R.id.RbRoberto)
        val RbLeo = findViewById<RadioButton>(R.id.RbLeo)
        val RbDaniel = findViewById<RadioButton>(R.id.RbDaniel)
        val Pregunta= findViewById<TextView>(R.id.TvPregunta)
        if(RbRoberto.isChecked){
            val medicoNuevo=Medico()
            medicoNuevo.nombre="Roberto"
            medicoNuevo.apellido="Abadia"
            medicoNuevo.edad="44"
            medicoNuevo.dni="46572390"
            medicoNuevo.tipoDoctorado="Neurología"
            medicoNuevo.aniosExperiencia="11"
            val intent= Intent (this, ResultadosMedico::class.java)
            intent.putExtra("medico",medicoNuevo)
            startActivity(intent)
        }
        else if(RbLeo.isChecked){
            val medicoNuevo=Medico()
            medicoNuevo.nombre="Leonardo"
            medicoNuevo.apellido="Fumarola"
            medicoNuevo.edad="40"
            medicoNuevo.dni="18463001"
            medicoNuevo.tipoDoctorado="Pediatría"
            medicoNuevo.aniosExperiencia="9"
            val intent= Intent (this, ResultadosMedico::class.java)
            intent.putExtra("medico",medicoNuevo)
            startActivity(intent)
        }
        else if(RbDaniel.isChecked){
            val medicoNuevo=Medico()
            medicoNuevo.nombre="Daniel"
            medicoNuevo.apellido="Gentile"
            medicoNuevo.edad="37"
            medicoNuevo.dni="76485401"
            medicoNuevo.tipoDoctorado="Cardiología"
            medicoNuevo.aniosExperiencia="13"
            val intent= Intent (this, ResultadosMedico::class.java)
            intent.putExtra("medico",medicoNuevo)
            startActivity(intent)
        }
        else{
            Toast.makeText(this,"Necesita elegir un médico.", Toast.LENGTH_SHORT).show()
        }
    }
}
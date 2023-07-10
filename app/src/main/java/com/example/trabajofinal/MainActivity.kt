package com.example.trabajofinal

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

lateinit var service: ApiService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val IvCruz= findViewById<ImageView>(R.id.ivCruz)
        val url="https://i.pinimg.com/originals/7d/8b/7e/7d8b7eaff56ec97e6df928bce9bd9f3d.jpg"
        Picasso.get()
            .load(url)
            .resize(50,50)
            .centerCrop()
            .into(IvCruz)
        val botonResultados= findViewById<Button>(R.id.BtnNext)
        botonResultados.setOnClickListener(){
            createPaciente()
        }
    }
    @SuppressLint("SuspiciousIndentation")
    fun createPaciente(){
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
        val ConviertoEtDni= EtDNI.text.toString()
        val ConviertoEtPeso= EtPeso.text.toString()
        val ConviertoEtAltura= EtAltura.text.toString()
        val ConviertoEtDiagnostico= EtDiagnostico.text.toString()

            if(ConviertoEtNombre.isEmpty()){
                Toast.makeText(this,"No hay un nombre ingresado",Toast.LENGTH_SHORT).show()
            }
            else if(ConviertoEtApellido.isEmpty()){
                Toast.makeText(this,"No hay un apellido ingresado",Toast.LENGTH_SHORT).show()
            }
            else if(ConviertoEtEdad.isEmpty()){
                Toast.makeText(this,"No hay una edad ingresada",Toast.LENGTH_SHORT).show()
            }
            else if(ConviertoEtDni.isEmpty()){
                Toast.makeText(this,"No hay un dni ingresado",Toast.LENGTH_SHORT).show()
            }
            else if(ConviertoEtPeso.isEmpty()){
                Toast.makeText(this,"No hay una peso ingresado",Toast.LENGTH_SHORT).show()
            }
            else if(ConviertoEtAltura.isEmpty()){
                Toast.makeText(this,"No hay una altura ingresada",Toast.LENGTH_SHORT).show()
            }
            else if(ConviertoEtDiagnostico.isEmpty()){
                Toast.makeText(this,"No se especificó el diagnostico.",Toast.LENGTH_SHORT).show()
            }
            else{
                val pacienteNuevo=Paciente()
                pacienteNuevo.nombre=ConviertoEtNombre
                pacienteNuevo.apellido=ConviertoEtApellido
                pacienteNuevo.edad=ConviertoEtEdad
                pacienteNuevo.dni=ConviertoEtDni
                pacienteNuevo.peso=ConviertoEtPeso
                pacienteNuevo.altura=ConviertoEtAltura
                pacienteNuevo.diagnostico=ConviertoEtDiagnostico

                val intent= Intent(this,ResultadosPaciente::class.java)
                intent.putExtra("paciente",pacienteNuevo)
                startActivity(intent)
            }
        }
}

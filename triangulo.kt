package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import kotlin.math.acos
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.sqrt

class triangulo : AppCompatActivity() {
    lateinit var mostrar: EditText
    lateinit var yung :EditText
    lateinit var  heaven :EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangulo)
        var lado1=findViewById<EditText>(R.id.editTextNumber2)
        var boton=findViewById<Button>(R.id.button3)
        var botonav=findViewById<ImageButton>(R.id.imageButton11)
        mostrar=findViewById<EditText>(R.id.editTextNumber15)
        yung=findViewById<EditText>(R.id.editTextNumber14)
        heaven=findViewById<EditText>(R.id.editTextNumber16)
        boton.setOnClickListener {
            val convertir:String=lado1.text.toString()
            val con1:String=mostrar.text.toString()
            val con2:String=yung.text.toString()
            val con3:String=heaven.text.toString()
            if (convertir.isNotEmpty()) {
                val ente:Int=convertir.toInt()
                val pepe=ente.toDouble()
                isoseles(ente)
                trianguloareaiso(pepe)
                angulo(ente)
            }
            if(con1.isNotEmpty()){
                val ente:Int=con1.toInt()
                val pepe=ente.toDouble()
                trianguloareaiso(pepe)
                angulo(ente)
            }
            if(con2.isNotEmpty()){
                val ente:Int=con2.toInt()
                isoseles(ente)
                angulo(ente)
            }
            if(con3.isNotEmpty()){
                val ente:Int=con1.toInt()
                val pepe=ente.toDouble()
                trianguloareaiso(pepe)
                isoseles(ente)
            }

        }
        botonav.setOnClickListener {
            var pepe= Intent(this,triangulo_ex::class.java)
            startActivity(pepe)
        }
    }
    fun isoseles(ladox:Int){
        val c = ((4 * ladox * ladox / 5).toDouble()).pow(0.5)
        val conver=c.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        mostrar.text=editable
    }
    fun trianguloareaiso(dato:Double){
        val pe=sqrt(dato* dato - (4 * 4 / 4))
        val conver=pe.toString()
        val editable:Editable= Editable.Factory.getInstance().newEditable(conver)
        yung.text=editable
    }
    fun radianesToGrados(radianes: Double): Double {
        return radianes * 180 / 3.14159265359
    }
    fun angulo(dati:Int){
        val d=dati.toDouble()
        val ope=radianesToGrados(acos(3 / (54.5 / (2 * 5))))
        val conver=ope.toString()
        val editable:Editable= Editable.Factory.getInstance().newEditable(conver)
        heaven.text=editable
    }
}
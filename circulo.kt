package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView


class circulo : AppCompatActivity() {
    lateinit var vista: EditText
    lateinit var ver: EditText
    lateinit var ger: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circulo)
        var botoncir=findViewById<Button>(R.id.button2)
        var dato=findViewById<EditText>(R.id.editTextNumber)
        var botonnav=findViewById<ImageButton>(R.id.imageButton6)
        vista=findViewById<EditText>(R.id.editTextNumber10)
        ver= findViewById<EditText>(R.id.editTextNumber11)
        ger=findViewById<EditText>(R.id.editTextNumber12)
        botoncir.setOnClickListener {
            var convertir:String = dato.text.toString()
            var con1:String = vista.text.toString()
            var con2:String = ver.text.toString()
            var con3:String = ger.text.toString()
            if(convertir.isNotEmpty()){
                var entero:Int=convertir.toInt()
                circulo(entero)
                area(entero)
                volumen(entero)
            }
            if (con1.isNotEmpty()){
                var entero:Int=con1.toInt()
                area(entero)
                volumen(entero)
            }
            if (con2.isNotEmpty()){
                var entero:Int=con2.toInt()
                circulo(entero)
                volumen(entero)
            }
            if (con3.isNotEmpty()){
                var entero:Int=con3.toInt()
                circulo(entero)
                area(entero)
            }

        }
        botonnav.setOnClickListener {
            var pepe=Intent(this,circulo_ex::class.java)
            startActivity(pepe)
        }
    }
    fun circulo(datos:Int){
        var la=3.14159*datos*2
        var conver=la.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        vista.text=editable
    }
    fun area(datos2:Int){
       val res= 3.14159265359 *datos2*datos2
       val conver=res.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
       ver.text=editable
    }
    fun volumen(datos3:Int){
        val res=3.14159265359*datos3*datos3*5
        val conver=res.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        ger.text=editable
    }
}
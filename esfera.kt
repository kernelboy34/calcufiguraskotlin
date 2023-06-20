package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class esfera : AppCompatActivity() {
    lateinit var chavo : TextView
    lateinit var yung : TextView
    lateinit var  heaven :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esfera)
        var botonsub=findViewById<Button>(R.id.button8)
        var dato=findViewById<EditText>(R.id.editTextNumber4)
        var botonav=findViewById<ImageButton>(R.id.imageButton9)
        chavo=findViewById<EditText>(R.id.editTextNumber22)
        yung=findViewById<EditText>(R.id.editTextNumber23)
        heaven=findViewById<EditText>(R.id.editTextNumber24)
        botonsub.setOnClickListener {
            var valor1:String=chavo.text.toString()
            var valor2:String=yung.text.toString()
            var valor3:String=heaven.text.toString()
            var valor: String = dato.text.toString()
            if (valor.isNotEmpty()) {
                var vaa:Int=valor.toInt()
                proceso(vaa)
                perimetro(vaa)
                volumendelcubo(vaa)
            }
            if (valor1.isNotEmpty()){
                var vaa1:Int=valor1.toInt()
                perimetro(vaa1)
                volumendelcubo(vaa1)
            }
            if(valor2.isNotEmpty()){
                var vaa2:Int=valor2.toInt()
                proceso(vaa2)
                volumendelcubo(vaa2)
            }
            if(valor3.isNotEmpty()){
                var vaa3:Int=valor3.toInt()
                proceso(vaa3)
                perimetro(vaa3)
            }
        }
        botonav.setOnClickListener {
            var pepe= Intent(this,esfera_ex::class.java)
            startActivity(pepe)
        }
    }
    fun proceso(numero:Int){
        var multi=numero*2
        var conver=multi.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        chavo.text=editable
    }
    fun perimetro(numero2:Int){
        var j= numero2*4
        var conver:String=j.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        yung.text = editable
    }
    fun volumendelcubo(numero3:Int){
        var j= numero3*numero3*numero3
        var conver=j.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        heaven.text=editable
    }
}
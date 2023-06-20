package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import kotlin.math.pow

class rectangulo : AppCompatActivity() {
    lateinit var chavo : EditText
    lateinit var yung : EditText
    lateinit var  heaven : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangulo)
        var botonsub=findViewById<Button>(R.id.button10)
        var botonnav=findViewById<ImageButton>(R.id.imageButton10)
        var dato=findViewById<EditText>(R.id.editTextNumber6)
        chavo=findViewById<EditText>(R.id.editTextNumber13)
        yung=findViewById<EditText>(R.id.editTextNumber17)
        heaven=findViewById<EditText>(R.id.editTextNumber18)
        botonsub.setOnClickListener {
            var valor: String = dato.text.toString()
            var valor1:String=chavo.text.toString()
            var valor2:String=yung.text.toString()
            var valor3:String=heaven.text.toString()
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
        botonnav.setOnClickListener {
            val mainp = Intent(this, rectangulo_ex::class.java)
            startActivity(mainp)
        }
    }
    fun proceso(pe:Int){
        val julio= 3.14159265359*pe*2
        val conver= julio.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        chavo.text=editable
    }
    fun perimetro(pe:Int){
        val julio= 3.14159265359*pe*pe
        val conver= julio.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        yung.text=editable
    }
    fun volumendelcubo(pe:Int){
        val julio= (4.0/3.0) *  3.14159265359*pe*pe*pe
        val conver= julio.toString()
        val editable: Editable = Editable.Factory.getInstance().newEditable(conver)
        heaven.text=editable
    }
}
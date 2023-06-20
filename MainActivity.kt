package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttoncua=findViewById<ImageButton>(R.id.imageButton4)
        var buttontri=findViewById<ImageButton>(R.id.imageButton2)
        var redondo=findViewById<ImageButton>(R.id.imageButton)
        var dfigure=findViewById<ImageButton>(R.id.imageButton5)
        var rectan= findViewById<ImageButton>(R.id.imageButton3)
        redondo.setOnClickListener{
            val mainp = Intent(this, circulo::class.java)
            startActivity(mainp)
        }
        buttontri.setOnClickListener{
            val mainp = Intent(this, triangulo::class.java)
            startActivity(mainp)
        }
        buttoncua.setOnClickListener{
            val mainp = Intent(this, cuadrado::class.java)
            startActivity(mainp)
        }
        dfigure.setOnClickListener{
            val mainp = Intent(this, edfigure::class.java)
            startActivity(mainp)
        }
        rectan.setOnClickListener {
            val mainp = Intent(this, rectangulo::class.java)
            startActivity(mainp)
        }



    }
}
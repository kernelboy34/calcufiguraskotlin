package com.example.figuras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class edfigure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edfigure)
        var buttoncua=findViewById<Button>(R.id.button4)
        var buttontri=findViewById<Button>(R.id.button5)
        var dfigure=findViewById<Button>(R.id.button6)
        buttontri.setOnClickListener{
            val mainp = Intent(this, esfera::class.java)
            startActivity(mainp)
        }
        buttoncua.setOnClickListener{
            val mainp = Intent(this, piramide::class.java)
            startActivity(mainp)
        }
        dfigure.setOnClickListener{
            val mainp = Intent(this, cubo::class.java)
            startActivity(mainp)
        }
    }
}
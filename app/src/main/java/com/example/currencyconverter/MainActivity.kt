package com.example.currencyconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val getText: EditText = findViewById(R.id.Edttxt)
        val Rupee: Button = findViewById(R.id.btn1)
        val Dollar: Button = findViewById(R.id.btn2)
        val Contxt: TextView = findViewById(R.id.vitxt)
        Rupee.setOnClickListener {
            val amount = getText.text.toString().toFloat()
            val rup = 80*amount
            Contxt.text = "Rupees : $rup"

        }

        Dollar.setOnClickListener {
            val amount = getText.text.toString().toFloat()
            val dol = amount/80
            Contxt.text = "Dollars : $dol"

        }


    }
}
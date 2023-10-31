package com.example.app18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.app18.MainActivity.Companion.typePatient
import com.example.app18.MainActivity.Companion.typeVent

class MainActivity2 : AppCompatActivity() {

    private lateinit var helloText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Toast.makeText(this,"Ventilation is  ${typeVent} and ${ typePatient}", Toast.LENGTH_SHORT).show()

        helloText = findViewById(R.id.helloText)
        helloText.text = "You have chosen ${typeVent} type Ventilation for ${typePatient} patient."
    }
}
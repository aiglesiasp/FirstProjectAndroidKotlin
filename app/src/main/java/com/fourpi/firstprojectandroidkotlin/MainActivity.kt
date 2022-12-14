package com.fourpi.firstprojectandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtener STRINGS
        val textSaludo = getString(R.string.HelloWorld)
        println(textSaludo)

        //Obtener colores
        val color = ContextCompat.getColor(this, R.color.orange)
    }
}
package com.fourpi.firstprojectandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textSaludo = getString(R.string.HelloWorld)
        println(textSaludo)
    }
}
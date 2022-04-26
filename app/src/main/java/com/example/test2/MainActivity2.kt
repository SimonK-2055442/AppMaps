package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test2.databinding.ActivityMain2Binding
import com.example.test2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        var ingelogdePersoon : Persoon = Persoon("","")

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        binding.aantalLanden.setText("Je hebt " + ingelogdePersoon.aantalLandenBezocht().toString() + " landen bezocht")
        binding.besteLand.setText("Jouw beste ervaring was in "  + ingelogdePersoon.besteLand)
        binding.slechtsteLand.setText("Jouw slechtste ervaring was in " + ingelogdePersoon.slechtsteLand)
        }

}

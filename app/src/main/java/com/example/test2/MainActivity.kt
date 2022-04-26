package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContract
import com.example.test2.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import java.nio.file.Files

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val inhoud: MutableList<Persoon> = mutableListOf()
        val Sander = Persoon("Sander", "DamnSun")
        val Simon = Persoon("Simon", "IkBenGay")
        inhoud.add(Sander)
        inhoud.add(Simon)

        var ingelogdPersoon: Persoon

        binding.logIn.setOnClickListener {

            var naam = binding.naam.text.toString()
            var code = binding.code.text.toString()
            var inSysteem: Boolean = false

            inhoud.forEach() { Persoon ->
                if (naam.contentEquals(Persoon.naam) && code.contentEquals(Persoon.code)) {
                    inSysteem = true
                    ingelogdPersoon = Persoon
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)
                }
            }
            if (!inSysteem) {
                Snackbar
                    .make(it, "fout", Snackbar.LENGTH_LONG)
                    .show()
            }
        }

        binding.signIn.setOnClickListener {
            var naam = binding.naam.text.toString()
            var code = binding.code.text.toString()

            //inhoud.forEach() { Persoon ->
                //if (!naam.contentEquals(Persoon.naam)) {
                    var persoon = Persoon(naam, code)
                    inhoud.add(persoon)
           //}
                /*else{
                    Snackbar
                        .make(it, "fout", Snackbar.LENGTH_LONG)
                        .show()
                }

            }*/
        }
    }
}



package com.example.test2.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.test2.databinding.FragmentHomeBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test2.Persoon
import com.example.test2.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.aantalLanden.setText("Je hebt ") //+ ingelogdePersoon.aantalLandenBezocht().toString() + " landen bezocht")
        binding.besteLand.setText("Jouw beste ervaring was in ")// + ingelogdePersoon.besteLand)
        binding.slechtsteLand.setText("Jouw slechtste ervaring was in ")// + ingelogdePersoon.slechtsteLand)
        return binding.root
    }


}


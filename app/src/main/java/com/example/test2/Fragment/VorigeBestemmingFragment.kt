package com.example.test2.Fragment

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test2.Persoon
import com.example.test2.R
import com.example.test2.databinding.FragmentVorigebestemmingenBinding

class VorigeBestemmingFragment : Fragment(R.layout.fragment_nieuw_land) {

    private lateinit var binding: FragmentVorigebestemmingenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVorigebestemmingenBinding.inflate(layoutInflater)
        return binding.root
    }
}

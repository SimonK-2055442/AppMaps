package com.example.test2.Fragment

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test2.R
import com.example.test2.databinding.FragmentPrestatiesBinding
import com.example.test2.Persoon

class PrestatiesFragment : Fragment(R.layout.fragment_nieuw_land) {

    private lateinit var binding: FragmentPrestatiesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
        ): View? {
        binding = FragmentPrestatiesBinding.inflate(layoutInflater)

        var ingelogdePersoon : Persoon = Persoon("","")
        var behaaldeAchievements: ArrayList<Int> = ingelogdePersoon.behaaldeAchievements
        for (i in behaaldeAchievements){
                if (behaaldeAchievements[i] == 1){
                    //textAch1.setTextColor(Color.GREEN)
                }
                if (behaaldeAchievements[i] == 2){
                //textAch2.setTextColor(Color.GREEN)
                }
                if (behaaldeAchievements[i] == 3){
                //textAch3.setTextColor(Color.GREEN)
                }
                if (behaaldeAchievements[i] == 4){
                //textAch4.setTextColor(Color.GREEN)
                }
                if (behaaldeAchievements[i] == 5){
                //textAch5.setTextColor(Color.GREEN)
                }
                if (behaaldeAchievements[i] == 6){
                //textAch6.setTextColor(Color.GREEN)
                }
            }
        return binding.root
    }
}



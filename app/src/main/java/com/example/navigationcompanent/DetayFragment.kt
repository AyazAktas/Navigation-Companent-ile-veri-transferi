package com.example.navigationcompanent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.navigation.navArgument
import androidx.navigation.navOptions
import com.example.navigationcompanent.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle:DetayFragmentArgs by navArgs()
        val gelenAd=bundle.ad 
        val gelenYas=bundle.yas
        val gelenBoy=bundle.boy

        val urunId=bundle.urun.id
        val urunAd=bundle.urun.ad

        binding.textViewBilgi.text="$gelenAd - $gelenYas - $gelenBoy - $urunId - $urunAd"

        return binding.root
    }


}
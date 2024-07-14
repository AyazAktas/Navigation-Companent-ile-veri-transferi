package com.example.navigationcompanent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcompanent.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonDetay.setOnClickListener {

            val urun = Urunler(100, ad = "Telefon")
            val gecis=AnasayfaFragmentDirections.detayGecis(urun=urun,ad="Ayaz", yas = 21, boy = 1.81f)


            Navigation.findNavController(it).navigate(gecis)



            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text="Nasılsın"
            // veri alan args , ana sayfa ise directions ekini alır
        }

        return binding.root
    }

}
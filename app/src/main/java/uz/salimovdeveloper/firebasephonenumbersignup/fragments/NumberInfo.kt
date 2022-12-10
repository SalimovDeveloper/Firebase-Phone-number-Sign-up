package uz.salimovdeveloper.firebasephonenumbersignup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.salimovdeveloper.firebasephonenumbersignup.R
import uz.salimovdeveloper.firebasephonenumbersignup.databinding.FragmentNumberInfoBinding
import uz.salimovdeveloper.firebasephonenumbersignup.models.MyNumber

class NumberInfo : Fragment() {
    private lateinit var binding: FragmentNumberInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNumberInfoBinding.inflate(layoutInflater)

        binding.numberInfo.text = MyNumber.mynumber

        return binding.root
    }
}
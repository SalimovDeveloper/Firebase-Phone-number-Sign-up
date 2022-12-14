package uz.salimovdeveloper.firebasephonenumbersignup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import uz.salimovdeveloper.firebasephonenumbersignup.R
import uz.salimovdeveloper.firebasephonenumbersignup.databinding.FragmentAddNumberBinding
import uz.salimovdeveloper.firebasephonenumbersignup.models.MyNumber

class AddNumber : Fragment() {
    private lateinit var binding: FragmentAddNumberBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddNumberBinding.inflate(layoutInflater)


        binding.btnNext.setOnClickListener {
            var number = binding.edtNumber.text.toString().trim()
            if (number !=""){

                MyNumber.mynumber = number
                findNavController().navigate(R.id.addPassword)

            }else{
                Toast.makeText(
                    requireContext(),
                    "Iltimos raqamingizni to'liq kiriting!!!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        return binding.root
    }
}
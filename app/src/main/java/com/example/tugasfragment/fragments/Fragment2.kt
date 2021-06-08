package com.example.tugasfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.tugasfragment.databinding.Fragment2Binding


class Fragment2 : Fragment() {

    private lateinit var displayMessage: TextView
    private var _binding: Fragment2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = Fragment2Binding.inflate(inflater, container, false)

        binding.displayMessage.text = arguments?.getString("message")

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
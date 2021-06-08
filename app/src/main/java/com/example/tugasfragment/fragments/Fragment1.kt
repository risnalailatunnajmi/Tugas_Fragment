package com.example.tugasfragment.fragments

import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.tugasfragment.Communicator
import com.example.tugasfragment.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    private lateinit var communicator: Communicator
    private lateinit var sendBtn: Button
    private lateinit var inputMessage: Message
    private var _binding: Fragment1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = Fragment1Binding.inflate(inflater, container, false)

        communicator = activity as Communicator

        return binding.root

       /** view.sendBtn.setOnClickListener {
            communicator.passDataCom(view.messageInput.text.toString())
        }
        return view*/
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListener()
    }

    private fun setupClickListener() = with(binding) {
        sendBtn.setOnClickListener {
            val  input = communicator.passDataCom(messageInput.text.toString())


        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
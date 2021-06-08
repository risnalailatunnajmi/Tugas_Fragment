package com.example.tugasfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasfragment.databinding.ActivityMainBinding
import com.example.tugasfragment.fragments.Fragment1
import com.example.tugasfragment.fragments.Fragment2

class MainActivity : AppCompatActivity(), Communicator {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragment1 = Fragment1()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment1)
            commit()
        }
    }

        override fun passDataCom(editTextInput: String) {
        val bundle = Bundle()
        bundle.putString("message", editTextInput)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment2 = Fragment2()
        fragment2.arguments  = bundle

        transaction.replace(R.id.fragment_container, fragment2)
        transaction.commit()
    }
}
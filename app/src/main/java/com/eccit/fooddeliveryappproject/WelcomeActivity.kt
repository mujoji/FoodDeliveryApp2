package com.eccit.fooddeliveryappproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eccit.fooddeliveryappproject.databinding.ActivityLoginBinding
import com.eccit.fooddeliveryappproject.databinding.ActivityRegistrationBinding

class WelcomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityRegistrationBinding
    lateinit var binding1: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegistrationBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)



    }
}
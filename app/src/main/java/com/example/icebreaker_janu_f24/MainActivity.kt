package com.example.icebreaker_janu_f24

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.icebreaker_janu_f24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSetRandomQuestion.setOnClickListener {
            binding.txtQuestion.text = "Hello"

        }
        binding.btnSubmit.setOnClickListener {
            binding.txtQuestion.text = ""

        }
        private fun writeStudentToFirebase(){
            val FirstName = binding.Textfirstname
            val LastName = binding.LastName
            val prefName = binding.prefName
        }

    }




    }


//
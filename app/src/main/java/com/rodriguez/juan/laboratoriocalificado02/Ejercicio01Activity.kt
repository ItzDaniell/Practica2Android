package com.rodriguez.juan.laboratoriocalificado02

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rodriguez.juan.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio01Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onResume() {
        super.onResume()
        binding.btnSend.setOnClickListener {
            binding.cuadro.visibility = View.VISIBLE
        }

        binding.btnSend1.setOnClickListener {
            binding.cuadro.visibility = View.GONE
        }
    }
}
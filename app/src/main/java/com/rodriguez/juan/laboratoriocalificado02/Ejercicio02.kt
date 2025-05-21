package com.rodriguez.juan.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rodriguez.juan.laboratoriocalificado02.databinding.ActivityEjercicio01Binding
import com.rodriguez.juan.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio02Binding

    private val NOMBRE_KEY = "NOMBRE_KEY"
    private val NUMERO_KEY = "NUMERO_KEY"
    private val PRODUCTOS_KEY = "PRODUCTOS_KEY"
    private val CIUDAD_KEY = "CIUDAD_KEY"
    private val DIRECCION_KEY = "DIRECCION_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onResume() {
        super.onResume()
        observeButtons()
    }

    private fun observeButtons() {
        binding.btnRegistrar.setOnClickListener {
            goDetailActivity()
        }
    }

    private fun goDetailActivity() {
        val nombre = binding.edtNombre.text.toString()
        val numero = binding.edtNumero.text.toString()
        val productos = binding.edtProductos.text.toString()
        val ciudad = binding.edtCiudad.text.toString()
        val direccion = binding.edtDireccion.text.toString()

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(NOMBRE_KEY, nombre)
        intent.putExtra(NUMERO_KEY, numero)
        intent.putExtra(PRODUCTOS_KEY, productos)
        intent.putExtra(CIUDAD_KEY, ciudad)
        intent.putExtra(DIRECCION_KEY, direccion)
        startActivity(intent)
    }
}
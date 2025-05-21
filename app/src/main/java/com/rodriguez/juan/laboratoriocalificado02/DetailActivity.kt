package com.rodriguez.juan.laboratoriocalificado02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rodriguez.juan.laboratoriocalificado02.databinding.ActivityDetailBinding
import com.rodriguez.juan.laboratoriocalificado02.databinding.ActivityEjercicio01Binding
import com.rodriguez.juan.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    private val NOMBRE_KEY = "NOMBRE_KEY"
    private val NUMERO_KEY = "NUMERO_KEY"
    private val PRODUCTOS_KEY = "PRODUCTOS_KEY"
    private val CIUDAD_KEY = "CIUDAD_KEY"
    private val DIRECCION_KEY = "DIRECCION_KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onResume() {
        super.onResume()
        showInformation()
    }

    private fun showInformation() {
        val bundle = intent.extras
        if (bundle != null) {
            val nombre = bundle.getString(NOMBRE_KEY)
            val numero = bundle.getString(NUMERO_KEY)
            val productos = bundle.getString(PRODUCTOS_KEY)
            val ciudad = bundle.getString(CIUDAD_KEY)
            val direccion = bundle.getString(DIRECCION_KEY)

            binding.tvNombre.text = "Nombre del Cliente: $nombre"
            binding.tvNumero.text = "Número del Cliente: $numero"
            binding.tvProducto.text = "Producto: $productos"
            binding.tvUbicacion.text = "Ubicación: $ciudad, $direccion"
        }
    }
}
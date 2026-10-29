package com.example.formulariousuario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonEnviar = findViewById<Button>(R.id.buttonEnviar)
        val EditTextNombre = findViewById<EditText>(R.id.editTextNombre)
        val EdittextEmail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val EditTextBibliografia = findViewById<EditText>(R.id.editTextBibliografia)
        val EditTextURlimagen = findViewById<EditText>(R.id.editTextURLimagen)

        buttonEnviar.setOnClickListener {
            val siguientePantalla = Intent(this, ProfileActivity::class.java)
            siguientePantalla.putExtra("Usuario", EditTextNombre.text.toString())
            //siguientePantalla.putExtra("Correo", EditTextNombre.text.toString())
            //siguientePantalla.putExtra("Biografia", EditTextNombre.text.toString())
            //siguientePantalla.putExtra("URL Imagen", EditTextNombre.text.toString())
            startActivity(siguientePantalla)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
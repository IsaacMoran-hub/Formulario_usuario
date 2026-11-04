package com.example.formulariousuario

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

            val usuario = findViewById<TextView>(R.id.textViewNombre)
            intent.getStringExtra("Usuario")
            usuario.setText("$usuario")

            val email = findViewById<TextView>(R.id.textViewCorreo)
            intent.getStringExtra("Correo")
            email.setText("$email")

            val biografia = findViewById<TextView>(R.id.textViewBibliografia)
            intent.getStringExtra("Biografia")
            biografia.setText("$biografia")


            val imagen = findViewById<ImageView>(R.id.imageView)
            Glide.with(imagen).load(intent.getStringExtra("URL Imagen")).into(imagen)

    }
}
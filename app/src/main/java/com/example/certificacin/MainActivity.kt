package com.example.certificacin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //declaracion de variables
    private lateinit var edtCodigo: EditText
    private lateinit var nombre: TextView
    private lateinit var descripcion: TextView
    private lateinit var precio: TextView
    private lateinit var imgProducto: ImageView
    private lateinit var btnBuscar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtCodigo=findViewById(R.id.edtCodigo)
        nombre=findViewById(R.id.tvNombre)
        descripcion=findViewById(R.id.tvDescripcion)
        precio=findViewById(R.id.tvPrecio)
        imgProducto=findViewById(R.id.imgProducto)
        btnBuscar=findViewById(R.id.btnBuscar)

        //metodo buscar producto
        btnBuscar.setOnClickListener { v ->


        };

    }
    private void getShoes

    val retrofit: Retrofit = Builder()
        .baseUrl("https://api.github.com/")
        .build()

    val service: GitHubService = retrofit.create(GitHubService::class.java)
}
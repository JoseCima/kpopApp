package com.example.kpopapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetalleBts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_bts)

        val index = intent.getStringExtra("ID")?.toInt()
        //Log.d("INDEX", index.toString())
        val contacto = index?.let { BTS.categoriasGruposBTS?.get(it) }
        var imageView = findViewById<ImageView>(R.id.imgDesc)
        var tvDescripcion = findViewById<TextView>(R.id.tvDesc)
        var nameCat  =findViewById<TextView>(R.id.nombreCategoria)

        imageView.setImageResource(contacto!!.imagen)

        tvDescripcion.text= contacto?.descripcion

        nameCat.text= contacto?.nombrePortada
    }
}
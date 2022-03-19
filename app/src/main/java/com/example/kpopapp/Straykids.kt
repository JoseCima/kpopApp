package com.example.kpopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Straykids : AppCompatActivity() {

    var grid: GridView?=null
    var adaptador:AdaptadorGrid?=null
    companion object{
        var categoriasGruposStray = ArrayList<Categorias>()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_straykids)

        categoriasGruposStray = ArrayList()

        categoriasGruposStray?.add(Categorias("INTEGRANTES", R.drawable.integrantes, R.drawable.detalles_integrantes_straykids,"EJEMPLO DESCRIPCION INTEGRANTES STRAYKIDS"))
        categoriasGruposStray?.add(Categorias("ÁLBUMES", R.drawable.albumes, R.drawable.detalles_albumes_straykids, "EJEMPLO DESCRIPCION ALBUMES STRAYKIDS"))
        categoriasGruposStray?.add(Categorias("SU DEBUT", R.drawable.debut, R.drawable.detalles_debut_straykids, "EJEMPLO DESCRIPCION DEBUT STRAYKIDS"))
        categoriasGruposStray?.add(Categorias("LOGROS", R.drawable.logros, R.drawable.detalles_logros_straykids, "EJEMPLO DESCRIPCION LOGROS STRAYKIDS"))
        categoriasGruposStray?.add(Categorias("COLABORACIONES", R.drawable.colabs, R.drawable.detalles_colaboraciones_straykids, "EJEMPLO DESCRIPCION COLABORACIONES STRAYKIDS"))
        categoriasGruposStray?.add(Categorias("SU CONTRATO", R.drawable.contrato, R.drawable.detalles_contrato_straykids, "EJEMPLO DESCRIPCION CONTRATO STRAYKIDS"))


        grid=findViewById<GridView>(R.id.grid)

        adaptador =  AdaptadorGrid(this, categoriasGruposStray!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleStraykids::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
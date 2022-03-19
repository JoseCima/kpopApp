package com.example.kpopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Twice : AppCompatActivity() {

    var grid: GridView?=null
    var adaptador:AdaptadorGrid?=null
    companion object{
        var categoriasGruposTwice= ArrayList<Categorias>()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twice)

        categoriasGruposTwice= ArrayList()

        categoriasGruposTwice?.add(Categorias("INTEGRANTES", R.drawable.integrantes, R.drawable.detalles_integrantes_twice,"EJEMPLO DESCRIPCION INTEGRANTES TWICE"))
        categoriasGruposTwice?.add(Categorias("ÁLBUMES", R.drawable.albumes, R.drawable.detalles_albumes_twice, "EJEMPLO DESCRIPCION ALBUMES TWICE"))
        categoriasGruposTwice?.add(Categorias("SU DEBUT", R.drawable.debut, R.drawable.detalles_debut_twice, "EJEMPLO DESCRIPCION DEBUT TWICE"))
        categoriasGruposTwice?.add(Categorias("LOGROS", R.drawable.logros, R.drawable.detalles_logros_twice, "EJEMPLO DESCRIPCION LOGROS TWICE"))
        categoriasGruposTwice?.add(Categorias("COLABORACIONES", R.drawable.colabs, R.drawable.detalles_colaboraciones_twice, "EJEMPLO DESCRIPCION COLABORACIONES TWICE"))
        categoriasGruposTwice?.add(Categorias("SU CONTRATO", R.drawable.contrato, R.drawable.detalles_contrato_twice, "EJEMPLO DESCRIPCION CONTRATO TWICE"))


        grid=findViewById<GridView>(R.id.grid)

        adaptador =  AdaptadorGrid(this, categoriasGruposTwice!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleTwice::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
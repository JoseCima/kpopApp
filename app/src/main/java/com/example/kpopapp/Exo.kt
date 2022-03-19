package com.example.kpopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Exo : AppCompatActivity() {

    var grid: GridView?=null
    var adaptador:AdaptadorGrid?=null
    companion object{
        var categoriasGruposExo = ArrayList<Categorias>()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exo)

        categoriasGruposExo = ArrayList()

        categoriasGruposExo?.add(Categorias("INTEGRANTES", R.drawable.integrantes, R.drawable.detalles_integrantes_exo,"EJEMPLO DESCRIPCION INTEGRANTES EXO"))
        categoriasGruposExo?.add(Categorias("ÁLBUMES", R.drawable.albumes, R.drawable.detalles_albumes_exo, "EJEMPLO DESCRIPCION ALBUMES EXO"))
        categoriasGruposExo?.add(Categorias("SU DEBUT", R.drawable.debut, R.drawable.detalles_debut_exo, "EJEMPLO DESCRIPCION DEBUT EXO"))
        categoriasGruposExo?.add(Categorias("LOGROS", R.drawable.logros, R.drawable.detalles_logros_exo, "EJEMPLO DESCRIPCION LOGROS EXO"))
        categoriasGruposExo?.add(Categorias("COLABORACIONES", R.drawable.colabs, R.drawable.detalles_colaboraciones_exo, "EJEMPLO DESCRIPCION COLABORACIONES EXO"))
        categoriasGruposExo?.add(Categorias("SU CONTRATO", R.drawable.contrato, R.drawable.detalles_contrato_exo, "EJEMPLO DESCRIPCION CONTRATO EXO"))


        grid=findViewById<GridView>(R.id.grid)

        adaptador =  AdaptadorGrid(this, categoriasGruposExo!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleExo::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
package com.example.kpopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class BTS : AppCompatActivity() {

    var grid: GridView?=null
    var adaptador:AdaptadorGrid?=null
    companion object{
        var categoriasGruposBTS = ArrayList<Categorias>()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bts)

        categoriasGruposBTS = ArrayList()

        categoriasGruposBTS?.add(Categorias("INTEGRANTES", R.drawable.integrantes, R.drawable.detalles_interantes_bts,"EJEMPLO DESCRIPCION INTEGRANTES BTS"))
        categoriasGruposBTS?.add(Categorias("ÁLBUMES", R.drawable.albumes, R.drawable.detalles_albumes_bts, "EJEMPLO DESCRIPCION ALBUMES BTS"))
        categoriasGruposBTS?.add(Categorias("SU DEBUT", R.drawable.debut, R.drawable.detalles_debut_bts, "EJEMPLO DESCRIPCION DEBUT BTS"))
        categoriasGruposBTS?.add(Categorias("LOGROS", R.drawable.logros, R.drawable.detalles_logros_bts, "EJEMPLO DESCRIPCION LOGROS BTS"))
        categoriasGruposBTS?.add(Categorias("COLABORACIONES", R.drawable.colabs, R.drawable.detalles_colaboraciones_bts, "EJEMPLO DESCRIPCION COLABORACIONES BTS"))
        categoriasGruposBTS?.add(Categorias("SU CONTRATO", R.drawable.contrato, R.drawable.detalles_contrato_bts, "EJEMPLO DESCRIPCION CONTRATO BTS"))


        grid=findViewById<GridView>(R.id.grid)

        adaptador =  AdaptadorGrid(this, categoriasGruposBTS!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleBts::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
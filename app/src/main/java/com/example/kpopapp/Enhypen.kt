package com.example.kpopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class Enhypen : AppCompatActivity() {

    var grid: GridView?=null
    var adaptador:AdaptadorGrid?=null
    companion object{
        var categoriasGruposEnhypen = ArrayList<Categorias>()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enhypen)

        categoriasGruposEnhypen = ArrayList()

        categoriasGruposEnhypen?.add(Categorias("INTEGRANTES", R.drawable.integrantes, R.drawable.detalles_integrantes_enhypen,"EJEMPLO DESCRIPCION INTEGRANTES ENHYPEN"))
        categoriasGruposEnhypen?.add(Categorias("ÁLBUMES", R.drawable.albumes, R.drawable.detalles_albumes_enhypen, "EJEMPLO DESCRIPCION ALBUMES ENHYPEN"))
        categoriasGruposEnhypen?.add(Categorias("SU DEBUT", R.drawable.debut, R.drawable.detalles_debut_enhypen, "EJEMPLO DESCRIPCION DEBUT ENHYPEN"))
        categoriasGruposEnhypen?.add(Categorias("LOGROS", R.drawable.logros, R.drawable.detalles_logros_enhypen, "EJEMPLO DESCRIPCION LOGROS ENHYPEN"))
        categoriasGruposEnhypen?.add(Categorias("COLABORACIONES", R.drawable.colabs, R.drawable.detalles_colaboraciones_enhypen, "EJEMPLO DESCRIPCION COLABORACIONES ENHYPEN"))
        categoriasGruposEnhypen?.add(Categorias("SU CONTRATO", R.drawable.contrato, R.drawable.detalles_contrato_enhypen, "EJEMPLO DESCRIPCION CONTRATO ENHYPEN"))


        grid=findViewById<GridView>(R.id.grid)

        adaptador =  AdaptadorGrid(this, categoriasGruposEnhypen!!)
        grid?.adapter = adaptador


        grid?.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetalleEnhypen::class.java)
            intent.putExtra("ID", position.toString())
            startActivity(intent)
        }
    }
}
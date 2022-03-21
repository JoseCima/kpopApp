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

        categoriasGruposExo?.add(Categorias("INTEGRANTES", R.drawable.integrantes, R.drawable.detalles_integrantes_exo,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposExo?.add(Categorias("ÁLBUMES", R.drawable.albumes, R.drawable.detalles_albumes_exo, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposExo?.add(Categorias("SU DEBUT", R.drawable.debut, R.drawable.detalles_debut_exo, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposExo?.add(Categorias("LOGROS", R.drawable.logros, R.drawable.detalles_logros_exo, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposExo?.add(Categorias("COLABORACIONES", R.drawable.colabs, R.drawable.detalles_colaboraciones_exo, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposExo?.add(Categorias("SU CONTRATO", R.drawable.contrato, R.drawable.detalles_contrato_exo, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))


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
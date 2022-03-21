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

        categoriasGruposEnhypen?.add(Categorias("INTEGRANTES", R.drawable.integrantes, R.drawable.detalles_integrantes_enhypen,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposEnhypen?.add(Categorias("ÁLBUMES", R.drawable.albumes, R.drawable.detalles_albumes_enhypen, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposEnhypen?.add(Categorias("SU DEBUT", R.drawable.debut, R.drawable.detalles_debut_enhypen, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposEnhypen?.add(Categorias("LOGROS", R.drawable.logros, R.drawable.detalles_logros_enhypen, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposEnhypen?.add(Categorias("COLABORACIONES", R.drawable.colabs, R.drawable.detalles_colaboraciones_enhypen, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))
        categoriasGruposEnhypen?.add(Categorias("SU CONTRATO", R.drawable.contrato, R.drawable.detalles_contrato_enhypen, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sed dui eget urna molestie rutrum eu sed augue. Fusce rutrum, sapien dapibus sodales euismod, eros lacus porta lectus, vel convallis libero nibh et magna. Maecenas quis dui non lectus consequat blandit. Donec fringilla, felis quis accumsan sagittis, neque massa aliquam tellus, sit amet feugiat ante tortor eu tortor. Nulla facilisi. Nunc luctus scelerisque lobortis. Pellentesque interdum sollicitudin sodales. Praesent sollicitudin, purus id porttitor interdum, leo augue vestibulum metus, ut placerat leo dui id nisl. Suspendisse laoreet turpis at diam posuere mattis. Praesent tortor ante, egestas in arcu vitae, tincidunt vestibulum est. Phasellus gravida, ex nec semper varius, urna arcu pellentesque nibh, id ultricies nisi ipsum id ante. Duis mattis, tellus in tincidunt commodo, purus nulla tristique libero."))


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
package com.example.kpopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import com.example.kpopapp.Adaptador
import com.example.kpopapp.Grupo

class listView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        var grupos:ArrayList<Grupo> = ArrayList()
        grupos.add(Grupo("BLACKPINK", R.drawable.crown_blackpink))
        grupos.add(Grupo("BTS", R.drawable.logobts))
        grupos.add(Grupo("STRAY KIDS", R.drawable.logostraykids))
        grupos.add(Grupo("TWICE", R.drawable.logotwice))
        grupos.add(Grupo("EXO", R.drawable.logoexo))
        grupos.add(Grupo("ENHYPEN", R.drawable.logoenhypen))



        val lista =findViewById<ListView>(R.id.listaGrupos)

        //val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)//Tiene un elemento por celda. Le decimos que tome los valores de nuestro arreglo de frutas
        val adaptador =  Adaptador(this, grupos)
        lista.adapter = adaptador







        //Escuchando los toques
        lista.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            if(position==0){
                startActivity(Intent(this, Blackpink::class.java))
            }else if(position==1){
                startActivity(Intent(this, BTS::class.java))
            }else if(position==2){
                startActivity(Intent(this, Straykids::class.java))
            }else if(position==3){
                startActivity(Intent(this, Twice::class.java))
            }else if(position==4){
                startActivity(Intent(this, Exo::class.java))
            }else{
                startActivity(Intent(this, Enhypen::class.java))
            }
        }
    }
}
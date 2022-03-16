package com.example.kpopapp

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.kpopapp.Grupo
import org.w3c.dom.Text

class Adaptador(var context:Context, items:ArrayList<Grupo>):BaseAdapter() {

    var items:ArrayList<Grupo>? = null
    ///var boton: Button? = null



    init {
        this.items = items


    }


    override fun getCount(): Int {
        return items?.count()!! //Obtener el conteo de datos
    }

    override fun getItem(position: Int): Any {
        return items?.get(position)!!

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var holder:ViewHolder? =null
        var vista:View? = convertView
        if(vista == null){
            vista = LayoutInflater.from(context).inflate(R.layout.template, null)
            holder = ViewHolder(vista)
            vista.tag = holder

            if(position %2 == 1){
                vista.setBackgroundColor(Color.rgb(255,221,255))
            }else{
                vista.setBackgroundColor(Color.rgb(255,170,221))
            }
        }else{
            holder = vista.tag as? ViewHolder
        }

        val item = getItem(position) as Grupo
        holder?.nombre?.text = item.nombre
        holder?.imagen?.setImageResource(item.imagen)
        //holder?.boton?.setOnClickListener { item.nombre }




        return vista!!
    }

    private class ViewHolder(vista:View){
        var nombre: TextView? = null
        var imagen: ImageView? = null
        //Debemos añadir el siguiente codigo
        var boton : Button? =null

        init{
            nombre =  vista.findViewById(R.id.nameGroup)
            imagen = vista.findViewById(R.id.imgViewLogo)
            boton = vista.findViewById(R.id.btnDescubrir)



            boton?.setOnClickListener {
                Toast.makeText(vista.context, nombre?.text, Toast.LENGTH_SHORT ).show()
            }
        }
    }


}
package com.example.kpopapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorGrid (var context: Context, items:ArrayList<Categorias>): BaseAdapter() {

    var items:ArrayList<Categorias>? = null
    init {
        this.items = items
    }

    override fun getCount(): Int {
        return items?.count()!!
    }

    override fun getItem(position: Int): Any {
        return items?.get(position)!!
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var vista: View? = convertView
        var holder:ViewHolder? = null


        if (vista == null){
            vista = LayoutInflater.from(context).inflate(R.layout.template_grid, null)
            holder = ViewHolder(vista)
            vista.tag = holder

        }else{
            holder = vista.tag as? ViewHolder
        }


        val item = items?.get(position) as? Categorias
        holder?.nombre?.text = item?.nombrePortada
        holder?.imagen?.setImageResource(item?.imagenPortada!!)

        return vista!!
    }
    private class ViewHolder(vista: View){
        var nombre: TextView? = null
        var imagen: ImageView? = null

        init {
            nombre = vista.findViewById(R.id.nombre)
            imagen = vista.findViewById(R.id.imagen)

        }
    }
}
package edu.com.kotlinfirstprogram.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.com.kotlinfirstprogram.R
import kotlinx.android.synthetic.main.recycler_view.view.*

class AnimalAdapter(val items: ArrayList<String>, val context: Context) :
    RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.recycler_view, p0, false))


    }

    override fun getItemCount(): Int {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        // return items.size
        return items.size;

    }

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        holder?.animalType?.text = items.get(p1)

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val animalType = view.tv_animal_type

    }
}
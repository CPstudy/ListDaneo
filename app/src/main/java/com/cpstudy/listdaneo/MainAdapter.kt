package com.cpstudy.listdaneo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val dataSet: ArrayList<Daneo>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtEnglish: TextView = view.findViewById(R.id.txtEnglish)
        val txtKorean: TextView = view.findViewById(R.id.txtKorean)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtEnglish.text = dataSet[position].english
        holder.txtKorean.text = dataSet[position].korean
    }

    override fun getItemCount() = dataSet.count()
}
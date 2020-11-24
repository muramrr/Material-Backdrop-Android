package com.mmdev.backdrop_motionlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mmdev.backdrop_motionlayout.RecyclerAdapter.MyViewHolder

/**
 *
 */

class RecyclerAdapter(private val data: List<String>): RecyclerView.Adapter<MyViewHolder>() {
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
		MyViewHolder(
			LayoutInflater.from(parent.context).inflate(
				R.layout.item_recycler,
				parent,
				false
			)
		)
	
	override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
		holder.bind(data[position])
	}
	
	override fun getItemCount(): Int = data.size
	
	inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
		
		fun bind(item: String) {
			itemView.findViewById<TextView>(R.id.tvItem).text = item
		}
		
	}
	
	
	
}
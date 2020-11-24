package com.mmdev.backdrop_motionlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		findViewById<RecyclerView>(R.id.recyclerView).apply {
			adapter = RecyclerAdapter(List(20) { "Item $it" })
			layoutManager = LinearLayoutManager(context)
		}
	}
}
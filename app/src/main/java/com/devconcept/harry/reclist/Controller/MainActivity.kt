package com.devconcept.harry.reclist.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.devconcept.harry.reclist.Adapter.CategoryRecycleAdapter
import com.devconcept.harry.reclist.Adapter.CatergoryAdapter
import com.devconcept.harry.reclist.Model.Category
import com.devconcept.harry.reclist.R
import com.devconcept.harry.reclist.Services.DataService
import com.devconcept.harry.reclist.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

        // For ListView, Not for RecycleView
//        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "Clicked on ${category.title}", Toast.LENGTH_SHORT).show()
//        }

    }
}

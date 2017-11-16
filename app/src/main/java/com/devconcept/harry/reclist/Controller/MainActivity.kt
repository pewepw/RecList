package com.devconcept.harry.reclist.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.devconcept.harry.reclist.Adapter.CatergoryAdapter
import com.devconcept.harry.reclist.Model.Category
import com.devconcept.harry.reclist.R
import com.devconcept.harry.reclist.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CatergoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CatergoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

    }
}

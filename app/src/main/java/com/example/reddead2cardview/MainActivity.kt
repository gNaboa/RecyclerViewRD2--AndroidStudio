package com.example.reddead2cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reddead2cardview.RedDeadAdapter.RedDeadAdapter
import com.example.reddead2cardview.RedDeadData.DataSource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var redDeadAdapter:RedDeadAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initRecylerView()
        addData()

    }


    private fun addData(){

        val data = DataSource.createDataSet()
        redDeadAdapter.submitList(data)
    }

    private fun initRecylerView(){

       recyclerRedDead.layoutManager = LinearLayoutManager(this)
        val topSpacing = TopSpacingItemDecoration(30)
        recyclerRedDead.addItemDecoration(topSpacing)
        redDeadAdapter = RedDeadAdapter()
        recyclerRedDead.adapter  = redDeadAdapter


    }
}

package com.example.meishaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meishaapp.databinding.ActivityBookKidBinding
import com.example.meishaapp.databinding.ActivityHomeBinding
import java.util.ArrayList

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        lateinit var binding: ActivityHomeBinding
        binding.buttonMenu1.setOnClickListener {
            val i = Intent(applicationContext, ActivityBookKidBinding::class.java)
            startActivity(i)
        }

        val rvBuku:RecyclerView = binding.recyclerViewBuku
        rvBuku.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1, "Emi's Beach Adventure", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"))
        data.add(BukuModel(R.drawable.book2, "Ade's Beach Adventure", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"))
        data.add(BukuModel(R.drawable.book4, "Mermaid to rescue", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"))

        val adapter = AdapterHome(data)
        rvBuku.adapter = adapter
    }
}
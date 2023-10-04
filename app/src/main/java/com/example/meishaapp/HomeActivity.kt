package com.example.meishaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meishaapp.databinding.ActivityBookKidBinding
import com.example.meishaapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        lateinit var binding: ActivityHomeBinding
        binding.buttonMenu1.setOnClickListener {
            val i = Intent(applicationContext, ActivityBookKidBinding::class.java)
            startActivity(i)
        }

    }
}
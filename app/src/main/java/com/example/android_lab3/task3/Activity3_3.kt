package com.example.android_lab3.task3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity3_3: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)

        val button1: Button = findViewById(R.id.f3t1)
        button1.setOnClickListener {
            val clearFlag = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(Intent(this, Activity1_3::class.java).addFlags(clearFlag))
        }

        val button2: Button = findViewById(R.id.f3t2)
        button2.setOnClickListener {
            finish()
        }

        val bottom: BottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about)
                startActivity(Intent(this, ActivityAbout_3::class.java))
            return@setOnItemSelectedListener true
        }
    }
}
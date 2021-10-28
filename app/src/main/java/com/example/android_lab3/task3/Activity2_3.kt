package com.example.android_lab3.task3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity2_3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2);
        supportActionBar?.title = "Activity2"

        val button1: Button = findViewById(R.id.f2t3)
        button1.setOnClickListener {
            startActivity(Intent(this, Activity3_3::class.java))
        }

        val button2: Button = findViewById(R.id.f2t1)
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
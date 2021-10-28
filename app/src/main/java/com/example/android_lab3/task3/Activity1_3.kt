package com.example.android_lab3.task3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity1_3: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        val button: Button = findViewById(R.id.f1t2)
        button.setOnClickListener {
            startActivity(Intent(this, Activity2_3::class.java))
        }

        val bottom: BottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about)
                startActivity(Intent(this, ActivityAbout_3::class.java))
            return@setOnItemSelectedListener true
        }
    }
}
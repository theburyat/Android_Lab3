package com.example.android_lab3.task2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity1_2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        val button: Button = findViewById(R.id.bnToSecond)
        button.setOnClickListener {
            startActivity(Intent(this, Activity2_2::class.java))
        }

        val bottom: BottomNavigationView = findViewById(R.id.nav_view)
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity)
                startActivity(Intent(this, ActivityAbout_2::class.java))
            return@setOnItemSelectedListener true
        }
    }
}
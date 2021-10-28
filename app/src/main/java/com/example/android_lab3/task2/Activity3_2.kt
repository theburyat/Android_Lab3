package com.example.android_lab3.task2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity3_2: AppCompatActivity() {
    companion object {
        const val REQUEST = 1
        const val GO_TO_1 = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity3)
        supportActionBar?.title = "Activity3"

        val button1: Button = findViewById(R.id.f3t1)
        button1.setOnClickListener {
            setResult(GO_TO_1)
            finish()
        }

        val button2: Button = findViewById(R.id.f3t2)
        button2.setOnClickListener {
            finish()
        }

        val bottom: BottomNavigationView = findViewById(R.id.bottom_navigation_view)
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about)
                startActivity(Intent(this, ActivityAbout_2::class.java))
            return@setOnItemSelectedListener true
        }
    }
}
package com.example.android_lab3.task2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class Activity2_2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val button1: Button = findViewById(R.id.bnToThird)
        button1.setOnClickListener {
            startActivityForResult(Intent(this, Activity3_2::class.java),Activity3_2.REQUEST)
        }

        val button2: Button = findViewById(R.id.bnToFirst)
        button2.setOnClickListener {
            finish()
        }

        val bottom: BottomNavigationView = findViewById(R.id.nav_view)
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity)
                startActivity(Intent(this, ActivityAbout_2::class.java))
            return@setOnItemSelectedListener true
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Activity3_2.REQUEST && resultCode == Activity3_2.GO_TO_1) finish()
    }
}
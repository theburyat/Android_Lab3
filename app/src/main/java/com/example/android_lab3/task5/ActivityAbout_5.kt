package com.example.android_lab3.task5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R

class ActivityAbout_5: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title = "About"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
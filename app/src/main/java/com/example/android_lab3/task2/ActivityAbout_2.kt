package com.example.android_lab3.task2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab3.R

class ActivityAbout_2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about);
         supportActionBar?.title = "About"
    }
}
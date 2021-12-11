package com.example.android_lab3.task5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.android_lab3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity: AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)

        setupActionBarWithNavController(navController, appBarConfiguration)

        val bottom: BottomNavigationView = findViewById(R.id.nav_view)
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.aboutActivity)
                findNavController(R.id.nav_host_fragment_activity_main).navigate(R.id.aboutfrag)
            return@setOnItemSelectedListener true
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}
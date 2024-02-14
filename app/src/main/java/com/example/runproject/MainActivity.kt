package com.example.runproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navcontroller : NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomnavigation = findViewById<BottomNavigationView>(R.id.navigation_view_id)
        val navcontroller = findNavController(R.id.main_activity_id)

        val appBar = AppBarConfiguration(setOf(R.id.fav_Fragment,R.id.music_Fragment,R.id.places_Fragment,R.id.news_Fragment))
        setupActionBarWithNavController(navcontroller,appBar)

        bottomnavigation.setupWithNavController(navcontroller)




}}
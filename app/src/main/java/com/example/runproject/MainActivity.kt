package com.example.runproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var navHostFragment: NavHostFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      // val bottomnavigation = findViewById<BottomNavigationView>(R.id.navigation_view_id)
      // val navcontroller = findNavController(R.id.main_activity_id)

      // setupActionBarWithNavController(navcontroller,appBar)

      // bottomnavigation.setupWithNavController(navcontroller  )




          navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
          bottomNavigationView = findViewById(R.id.navigation_view_id)
        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.navController)







}}
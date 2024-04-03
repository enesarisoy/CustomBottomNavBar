package com.ns.custombottomnavbar

import android.content.res.TypedArray
import android.os.Bundle
import android.view.ViewGroup.MarginLayoutParams
import android.view.ViewGroup.TEXT_ALIGNMENT_CENTER
import android.view.ViewGroup.TEXT_ALIGNMENT_TEXT_END
import android.view.ViewGroup.TEXT_ALIGNMENT_TEXT_START
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.marginStart
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomBar = findViewById<ChipNavigationBar>(R.id.bottomBar)
        bottomBar.setItemSelected(R.id.homeFragment)

        val navController: NavController = Navigation.findNavController(this, R.id.navHost)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNav)

        bottomBar.setOnItemSelectedListener { itemId ->
            bottomNavigationView.selectedItemId = itemId
        }
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

    }
}


package com.example.demomvvm.screen.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demomvvm.R
import com.example.demomvvm.databinding.ActivityMainBinding
import com.example.demomvvm.screen.listUnsplash.UnsplashFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .addToBackStack(UnsplashFragment::javaClass.name)
            .replace(R.id.layoutContainer, UnsplashFragment.newInstance())
            .commit()
    }
}

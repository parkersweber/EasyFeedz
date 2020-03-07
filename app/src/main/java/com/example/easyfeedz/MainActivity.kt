package com.example.easyfeedz

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.easyfeedz.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity()
{

    lateinit var binding: ActivityMainBinding
    @Inject lateinit var appContext: Context

    override fun onCreate(savedInstanceState: Bundle?)
    {
        injector().inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myTextView.text = "Hello View Binding!"
    }
}

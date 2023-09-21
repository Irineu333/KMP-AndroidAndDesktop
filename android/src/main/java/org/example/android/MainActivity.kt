package org.example.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.example.android.databinding.ActivityMainBinding
import org.example.shared.getPlatform

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = String.format("Olá, %s", getPlatform().value)
    }
}
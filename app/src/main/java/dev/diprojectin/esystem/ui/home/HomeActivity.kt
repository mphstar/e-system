package dev.diprojectin.esystem.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
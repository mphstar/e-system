package dev.diprojectin.esystem.ui.sign_in

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}